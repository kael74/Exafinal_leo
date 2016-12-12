/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.model;

/**
 *
 * @author alum.fial7
 */
public class persona {
    private int idpersona;
    private String nombres;
    private String apellidos;
    private int idusuario;

    public persona() {
    }

    public persona(String nombres, String apellidos, int idusuario) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idusuario = idusuario;
    }

    public persona(int idpersona, String nombres, String apellidos, int idusuario) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idusuario = idusuario;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }


    
}
