/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Perfil;
import java.util.Date;
import java.util.List;


public interface IPerfilBO {
    void regsistrar(Perfil perfil);
    void eliminar(Perfil perfil);
    List<Perfil> getPerfil();
    boolean validarIDExiste(long id);
}
