/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.CastingDAO;
import DAO.ConexionBD;
import Interfaces.ICastingBO;
import Interfaces.ICastingDAO;
import entidades.Casting;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

public class CastingBO implements ICastingBO{
     ICastingDAO castingDAO = new CastingDAO(ConexionBD.getInstance());  
    
    @Override
    public void regsistrar(Casting casting){
        if(!(validarCastingExiste(casting.getNombre()))){
            if(!(validarIDExiste(casting.getNumCasting()))){
                castingDAO.agregar(casting);
            }
            else{
                JOptionPane.showMessageDialog(null, "ID de casting repetido", "Casting", JOptionPane.ERROR_MESSAGE); 
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Nombre de casting repetido", "Casting", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    @Override
    public void eliminar(Casting casting){
        castingDAO.eliminar(casting);
        
    }
    
    @Override
    public List<Casting> getCasting(){
        if(castingDAO.consultarTodos()!=null){
            return castingDAO.consultarTodos();
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay castings", "Casting", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    
    }
    
    @Override
    public List<Casting> getCastingNombre(String nombre){
        if(castingDAO.getCastingNombre(nombre)!=null){
            return castingDAO.getCastingNombre(nombre);
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay coincidencias", "Casting", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    
        
    }
    
    @Override
    public List<Casting> getCastingID(long idCliente){
        if(castingDAO.getCastingID(idCliente)!=null){
            return castingDAO.getCastingID(idCliente);
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay coincidencias", "Casting", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
     @Override
    public boolean validarCastingExiste(String nombre){
        if(castingDAO.getCastingNombre(nombre)==null){
            
            return false;
        }
        else{
            return true;
        }
    }
    
    @Override
    public boolean validarIDExiste(long id){
        if(castingDAO.getCastingID(id)==null){
            
            return false;
        }
        else{
            return true;
        }
    }
}
