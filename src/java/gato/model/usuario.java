/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.model;

/**
 *
 * @author UPEU
 */
public class usuario {
    private int idusuario;
    private String usuario;
    private String clave;
    private int idrol;

    public usuario() {
    }

    public usuario(String usuario, String clave, int idrol) {
        this.usuario = usuario;
        this.clave = clave;
        this.idrol = idrol;
    }

    public usuario(int idusuario, String usuario, String clave, int idrol) {
        this.idusuario = idusuario;
        this.usuario = usuario;
        this.clave = clave;
        this.idrol = idrol;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    
}
