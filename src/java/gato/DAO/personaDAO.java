/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.DAO;

import gato.interfaces.Operaciones;
import gato.model.persona;
import gato.model.rol;
import gato.util.coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alum.fial7
 */
public class personaDAO implements Operaciones<persona>{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
   
    private final static String SQL_CREATE = "INSERT INTO xxxx ( xxxx , xxxx ) VALUES (?, ?)";
    private final static String SQL_READ = "SELECT nombres, apellidos FROM usuario, persona WHERE usuario.idusuario = persona.idusuario and usuario.usuario =?";
    private final static String SQL_UPDATE = "UPDATE xxxx SET xxxx =?, xxxx =? WHERE xxxx =?";
    private final static String SQL_DELETE = "DELETE FROM xxxx WHERE xxxx =?";
    private final static String SQL_VALIDAR = "SELECT privilegio FROM rol, usuario WHERE usuario.privilegy = rol.idrol and usuario =?";

    @Override
    public int Validar(String user, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<persona> readall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<persona> read(String usuario) {
        List<persona> lista = new ArrayList<>();
        try {
            con = coneccion.getConexion();
            ps = con.prepareStatement(SQL_READ);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            while (rs.next()) {
                persona x = new persona();
                x.setNombres(rs.getString("nombres"));
                x.setApellidos(rs.getString("apellidos"));
                lista.add(x);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }

    @Override
    public int create(persona x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(persona x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
