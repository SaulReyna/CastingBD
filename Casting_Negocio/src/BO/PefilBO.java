/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.ConexionBD;
import DAO.PerfilDAO;
import Interfaces.IPerfilBO;
import Interfaces.IPerfilDAO;
import entidades.Perfil;
import java.util.List;
import javax.swing.JOptionPane;


public class PefilBO implements IPerfilBO{
    IPerfilDAO perfilDAO = new PerfilDAO(ConexionBD.getInstance()); 
    @Override
    public void regsistrar(Perfil perfil){
        if(validarPerfilNuevo(perfil)){
            JOptionPane.showMessageDialog(null, "Perfil repetido", "Perfil", JOptionPane.ERROR_MESSAGE); 
        }
        else{
            if(!validarIDExiste(perfil.getNumPerfil())){
                perfilDAO.agregar(perfil);
            }
            else{
                JOptionPane.showMessageDialog(null, "ID repetido", "Perfil", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }
   
    @Override
    public void eliminar(Perfil perfil){
        perfilDAO.eliminar(perfil);
        
    }
    
    @Override
    public List<Perfil> getPerfil(){
        return perfilDAO.consultarTodos();
    }
    
    public boolean validarPerfilNuevo(Perfil perfil){
        List<Perfil> productos = perfilDAO.consultarTodos();
        for (Perfil prov : productos) {
            Object[] fila = new Object[9];
            fila[0] = prov.getNumPerfil();
            fila[1] = prov.getEstado();
            fila[2] = prov.getSexo();
            fila[3] = prov.getRangoAltura();
            fila[4] = prov.getRangoEdad();
            fila[6] = prov.getEspecialidad();
            if(prov.isExperiencia()){
                fila[5] = "Si";
            }
            else{
                fila[5] = "No";
            }
            fila[7] = prov.getColorPelo();
            fila[8] = prov.getColorOjos();
            Object[] fila2 = new Object[9];
            fila2[0] = perfil.getNumPerfil();
            fila2[1] = perfil.getEstado();
            fila2[2] = perfil.getSexo();
            fila2[3] = perfil.getRangoAltura();
            fila2[4] = perfil.getRangoEdad();
            fila2[6] = perfil.getEspecialidad();
            if(perfil.isExperiencia()){
                fila2[5] = "Si";
            }
            else{
                fila2[5] = "No";
            }
            fila2[7] = perfil.getColorPelo();
            fila2[8] = perfil.getColorOjos();
            if((fila[1].equals(fila2[1]))&&(fila[2].equals(fila2[2]))&&(fila[3].equals(fila2[3]))&&(fila[4].equals(fila2[4]))&&
                    (fila[5].equals(fila2[5]))&&(fila[6].equals(fila2[6]))&&(fila[7].equals(fila2[7]))&&(fila[8].equals(fila2[8]))){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean validarIDExiste(long id){
        if(perfilDAO.consultar(id)==null){
            return false;
        }
        else{
            return true;
        }
    }

}
