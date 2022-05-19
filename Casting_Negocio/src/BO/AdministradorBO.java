/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.AdministradorDAO;
import DAO.ConexionBD;
import Interfaces.IAdministradorBO;
import Interfaces.IAdministradorDAO;
import entidades.Administrador;
import javax.swing.JOptionPane;


public class AdministradorBO implements IAdministradorBO{
    IAdministradorDAO adminDAO = new AdministradorDAO(ConexionBD.getInstance());  
    @Override
    public void regsistrar(Administrador administrador) {
        if(!(validarAdminExiste(administrador.getUsuario()))){
            adminDAO.agregar(administrador);
            JOptionPane.showMessageDialog(null, "Usuario registrado", "Administrador", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Usuario ya existe", "Administrador", JOptionPane.ERROR_MESSAGE); 
        }
    }

    @Override
    public boolean validarUsuarioContraseña(String usuarios, String contraseña) {
        if(validarAdminExiste(usuarios)){
            Administrador admin = new Administrador();
            admin = adminDAO.consultarUsuario(usuarios);
            if(admin.getContraseña().equals(contraseña)){
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Administrador", JOptionPane.ERROR_MESSAGE); 
                return false;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario no existe", "Administrador", JOptionPane.ERROR_MESSAGE); 
        return false;
    }
    
    @Override
    public boolean validarAdminExiste(String usuario){
        if(adminDAO.consultarUsuario(usuario)==null){
            return false;
        }
        else{
            
            return true;
        }
    }

}
