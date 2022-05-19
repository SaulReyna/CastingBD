/*
 * IClienteDAO.java
 */
package Interfaces;

import entidades.Cliente;
import java.util.List;

public interface IClienteDAO {
    boolean agregar(Cliente cliente);
    boolean eliminar(Cliente cliente);
    List<Cliente> consultarTodos();
    Cliente consultar(long idCliente);
    Cliente consultarNombre(String nombre);
    
}
