/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato.interfaces;

import java.util.List;

/**
 *
 * @author UPEU
 * @param <Entidad>
 */
public interface Operaciones<Entidad>{
    public int Validar(String user, String pass);
    public List<Entidad> readall();
    public List<Entidad> read(String usuario);
    public int create(Entidad x);
    public int update(Entidad x);
    public int delete(int id);
}
