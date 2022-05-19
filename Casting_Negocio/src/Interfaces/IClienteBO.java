/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Luis
 */
public interface IClienteBO {
    void regsistrar(Cliente cliente);
    void eliminar(Cliente cliente);
    List<Cliente> getCliente();
    boolean validarClienteExiste(String nombre);
    boolean validarIDExiste(long id);
}
