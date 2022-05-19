/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Fase;
import java.util.Date;
import java.util.List;

public interface IFaseBO {
    void regsistrar(Fase fase);
    void eliminar(Fase fase);
    List<Fase> getCliente();
    boolean validarFecha(Date fechInicio);
}
