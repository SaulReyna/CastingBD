/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Fase;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public interface IFaseDAO {
    boolean agregar(Fase fase);
    boolean eliminar(Fase fase);
    List<Fase> consultarTodos();
    Fase consultar(ObjectId idFase);
    Fase consultarFecha(Date fecha);
}
