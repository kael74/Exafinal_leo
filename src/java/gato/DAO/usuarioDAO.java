/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.DAO;

import gato.interfaces.Operaciones;
import gato.model.usuario;
import gato.util.coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author UPEU
 */
public class usuarioDAO implements Operaciones<usuario>{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
   
    private final static String SQL_CREATE = "INSERT INTO xxxx ( xxxx , xxxx ) VALUES (?, ?)";
    private final static String SQL_READALL = "SELECT *FROM xxxx";
    private final static String SQL_UPDATE = "UPDATE xxxx SET xxxx =?, xxxx =? WHERE xxxx =?";
    private final static String SQL_DELETE = "DELETE FROM xxxx WHERE xxxx =?";
    private final static String SQL_VALIDAR = "SELECT idusuario FROM usuario WHERE usuario=? and clave=?";

    @Override
    public List<usuario> readall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<usuario> read(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int create(usuario x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(usuario x) {
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
                op = rs.getInt("idusuario");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return op;    }
    
    
    
    
}
