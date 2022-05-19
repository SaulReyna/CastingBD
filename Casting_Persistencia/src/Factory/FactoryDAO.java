/**
 * FactoryDAO.java
 * 
 * Creada el 17 de Mayo del 2022 7:15PM
 */

package Factory;

import DAO.AgenteDAO;
import DAO.CastingDAO;
import DAO.ClientesDAO;
import DAO.PerfilDAO;
import Interfaces.IAgenteDAO;
import Interfaces.ICastingDAO;
import Interfaces.IClienteDAO;
import Interfaces.IPerfilDAO;
import com.mongodb.client.MongoDatabase;

public class FactoryDAO {
    
    private static MongoDatabase baseDatos;

    public static IClienteDAO crearCliente(){
        return new ClientesDAO(baseDatos);
    }
    
    public static ICastingDAO crearCasting(){
        return new CastingDAO(baseDatos);
    }
    
    public static IPerfilDAO crearPerfil(){
        return new PerfilDAO(baseDatos);
    }
    
    public static IAgenteDAO crearAgente(){
        return new AgenteDAO(baseDatos);
    }
    
}
