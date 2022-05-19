/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Administrador;
import java.util.List;

public interface IAdministradorBO {
    void regsistrar(Administrador administrador);
    boolean validarUsuarioContraseña(String usuarios, String contraseña);
    boolean validarAdminExiste(String usuario);
}
