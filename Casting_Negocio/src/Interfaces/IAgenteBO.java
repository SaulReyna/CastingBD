/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Agente;
import java.util.List;

public interface IAgenteBO {
    void regsistrar(Agente agente);
    void eliminar(Agente agente);
    List<Agente> getAgente();
    boolean validarAgenteExiste(String nombre);
    boolean validarIDExiste(long id);
}
