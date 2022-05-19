/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Casting;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public interface ICastingBO {
    void regsistrar(Casting casting);
    void eliminar(Casting casting);
    List<Casting> getCasting();
    List<Casting> getCastingNombre(String nombre);
    List<Casting> getCastingID(long idCliente);
    boolean validarCastingExiste(String nombre);
    boolean validarIDExiste(long id);
}
