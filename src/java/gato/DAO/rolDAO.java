/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.DAO;

import gato.interfaces.Operaciones;
import gato.model.rol;
import gato.util.coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UPEU
 */
public class rolDAO implements Operaciones<rol> {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
   
    private final static String SQL_CREATE = "INSERT INTO xxxx ( xxxx , xxxx ) VALUES (?, ?)";
    private final static String SQL_READ = "SELECT * FROM rol, usuario WHERE usuario.privilegy = rol.idrol and usuario.usuario =?";
    private final static String SQL_UPDATE = "UPDATE xxxx SET xxxx =?, xxxx =? WHERE xxxx =?";
    private final static String SQL_DELETE = "DELETE FROM xxxx WHERE xxxx =?";
    private final static String SQL_VALIDAR = "SELECT privilegio FROM rol, usuario WHERE usuario.privilegy = rol.idrol and usuario =? and clave =?";

    @Override
    public List<rol> readall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<rol> read(String usuario) {
        List<rol> lista = new ArrayList<>();
        try {
            con = coneccion.getConexion();
            ps = con.prepareStatement(SQL_READ);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            while (rs.next()) {
                rol x = new rol();
                x.setRol(rs.getString("rol"));
                x.setPrivilegio(rs.getInt("privilegio"));
                lista.add(x);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }

    @Override
    public int create(rol x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(rol x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Validar(String user, String pass) {
            int op=0;  
        try {
            con = coneccion.getConexion();
            ps = con.prepareStatement(SQL_VALIDAR);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                op = rs.getInt("privilegio");}
            } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;    
    }
}
