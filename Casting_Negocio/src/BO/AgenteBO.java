/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.AgenteDAO;
import DAO.ConexionBD;
import Interfaces.IAgenteBO;
import Interfaces.IAgenteDAO;
import entidades.Agente;
import java.util.List;
import javax.swing.JOptionPane;

public class AgenteBO implements IAgenteBO{
    IAgenteDAO agenteBO = new AgenteDAO(ConexionBD.getInstance());  
    
    @Override
    public void regsistrar(Agente agente){
        if(!(validarAgenteExiste(agente.getNombre()))){
            if(!(validarIDExiste(agente.getNumEmpleado()))){
                agenteBO.agregar(agente);
                JOptionPane.showMessageDialog(null, "Agente Registrado", "Agente", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    @Override
    public void eliminar(Agente agente){
        
        agenteBO.eliminar(agente);
        
    }
    
    @Override
    public List<Agente> getAgente(){
        return agenteBO.consultarTodos();
    }
    
    @Override
    public boolean validarAgenteExiste(String nombre){
        if(agenteBO.consultarNombre(nombre)==null){
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Nombre repetido", "Agente", JOptionPane.ERROR_MESSAGE); 
            return true;
        }
    }
    
    @Override
    public boolean validarIDExiste(long id){
        if(agenteBO.consultar(id)==null){
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "ID repetido", "Agente", JOptionPane.ERROR_MESSAGE); 
            return true;
        }
    }
}
