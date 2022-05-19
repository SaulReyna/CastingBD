/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Cliente;

/**
 *
 * @author Luis
 */
public interface IClienteDAO {
    void crearConexion();
    void insert(Cliente cliente);
    void eliminar(Cliente cliente);
    void getClientes();
    boolean getClientesNombre(String nombre);
}
