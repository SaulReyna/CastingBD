/*
 * IAdministradorDAO.java
 */
package Interfaces;

import entidades.Administrador;
import java.util.List;
import org.bson.types.ObjectId;

public interface IAdministradorDAO {
    boolean agregar(Administrador administrador);
    List<Administrador> consultarTodos();
    Administrador consultarUsuario(String usuario);
}
