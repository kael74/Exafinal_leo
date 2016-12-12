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
public class rol {
    private int idrol;
    private String rol;
    private int privilegio;

    public rol() {
    }

    public rol(String rol, int privilegio) {
        this.rol = rol;
        this.privilegio = privilegio;
    }

    public rol(int idrol, String rol, int privilegio) {
        this.idrol = idrol;
        this.rol = rol;
        this.privilegio = privilegio;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(int privilegio) {
        this.privilegio = privilegio;
    }
    

}
