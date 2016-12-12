/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.controller;

import gato.DAO.personaDAO;
import gato.DAO.rolDAO;
import gato.DAO.usuarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author UPEU
 */
@Controller
public class core {

    usuarioDAO ud = new usuarioDAO();
    rolDAO rd = new rolDAO();
    personaDAO pd = new personaDAO();
    
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/catalogo")
    public String catalogo(){
        return "catalogo";
    }
    @RequestMapping("/empleado")
    public String empleado(){
        return "empleado";
    }
    @RequestMapping("/cliente")
    public String cliente(){
        return "cliente";
    }
    @RequestMapping("/log")
    public String log(HttpServletRequest request, HttpServletResponse response){
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        HttpSession sesion = request.getSession();
        int sp = ud.Validar(user, pass);
        String url;
        
            if (sp != 0) {
                int perm = rd.Validar(user, pass);
                sesion.setAttribute("permiso", perm);
                sesion.setAttribute("usuario", user);
                sesion.setAttribute("persona", pd.read(user));
                sesion.setAttribute("rol", rd.read(user));
                url = "index";
            } else {
                url = "login";
            }
        
        return url;
    }
}
