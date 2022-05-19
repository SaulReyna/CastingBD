/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Perfil;
import java.util.List;

public interface IPerfilDAO {
    boolean agregar(Perfil  perfil);
    boolean eliminar(Perfil  perfil);
    List<Perfil> consultarTodos();
    Perfil consultar(long idPerfil);
}
