package BO;

import DAO.ClientesDAO;
import DAO.ConexionBD;
import Interfaces.IClienteBO;
import Interfaces.IClienteDAO;
import Interfaces.IConexionBD;
import entidades.Cliente;
import entidades.Direccion;
import entidades.Persona;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandra
 */
public class ClienteBO implements IClienteBO{
    IClienteDAO clientesDAO = new ClientesDAO(ConexionBD.getInstance());  
    
    @Override
    public void regsistrar(Cliente cliente){
        if(!(validarClienteExiste(cliente.getNombre()))){
            if(!validarIDExiste(cliente.getNumCliente())){
                clientesDAO.agregar(cliente);
            }
        }
    }
    
    @Override
    public void eliminar(Cliente cliente){
        
        clientesDAO.eliminar(cliente);
        
    }
    
    @Override
    public List<Cliente> getCliente(){
        return clientesDAO.consultarTodos();
    }
    
    @Override
    public boolean validarClienteExiste(String nombre){
        if(clientesDAO.consultarNombre(nombre)==null){
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Nombre repetido", "Cliente", JOptionPane.ERROR_MESSAGE); 
            return true;
        }
    }
    
    @Override
    public boolean validarIDExiste(long id){
        if(clientesDAO.consultar(id)==null){
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "ID repetido", "Cliente", JOptionPane.ERROR_MESSAGE); 
            return true;
        }
    }
    
}
