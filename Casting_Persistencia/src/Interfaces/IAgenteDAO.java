
package Interfaces;

import entidades.Agente;
import java.util.List;

public interface IAgenteDAO {
    boolean agregar(Agente agente);
    boolean eliminar(Agente agente);
    List<Agente> consultarTodos();
    Agente consultar(long idAgente);
    Agente consultarNombre(String nombre);
}
