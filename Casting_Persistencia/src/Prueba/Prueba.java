/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import DAO.CastingDAO;
import DAO.ClientesDAO;
import DAO.ConexionBD;
import DAO.FaseDAO;
import Interfaces.ICastingDAO;
import Interfaces.IClienteDAO;
import Interfaces.IFaseDAO;
import entidades.Agente;
import entidades.Casting;
import entidades.Cliente;
import entidades.Direccion;
import entidades.Fase;
import entidades.Persona;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Maste
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
        IClienteDAO clienteDAO = new ClientesDAO(ConexionBD.getInstance());      
////        clienteDAO.agregar(new Cliente("Miguel Hidalgo", new Direccion("Antonio Caso", "23B", "Villa Itson"), "6441177349", "moda" , new Persona("Don Pancho", "6419827643", new Direccion("Los arboles", "489y", "Mantecada"), "PELS021028HSRYPLA5")));
//        clienteDAO.eliminar(new Cliente("Miguel Hidalgo", new Direccion("Antonio Caso", "23B", "Villa Itson"), "6441177349", "moda" , new Persona("Don Pancho", "6419827643", new Direccion("Los arboles", "489y", "Mantecada"), "PELS021028HSRYPLA5")));
        clienteDAO.consultarTodos().forEach((cliente) -> { System.out.println(cliente);});
//        System.out.println(clienteDAO.consultarNombre("Pedro"));
//        Fase
        IFaseDAO faseDAO = new FaseDAO(ConexionBD.getInstance());  
        Date fecha2 = new Date();
        fecha2.setMonth(2);
        fecha2.setYear(119);
        Fase fases = new Fase();
        fases.setFechaInicio(fecha2);
        fases.setNumero(1);
//        faseDAO.agregar(fases);
        faseDAO.consultarTodos().forEach((fase) -> { System.out.println(fase);});
        
        
        ICastingDAO castingDAO = new CastingDAO(ConexionBD.getInstance());
        Date fecha = new Date();
        Casting casting = new Casting();
        casting.setCosto(Float.parseFloat("120.0"));
        casting.setFechaContratacion(fecha);
        casting.setNombre("si");
        casting.setDescripcion("sdasdsd");
        casting.setCliente(new Cliente("Miguel Hidalgo", new Direccion("Antonio Caso", "23B", "Villa Itson"), "6441177349", "moda" , new Persona("Don Pancho", "6419827643", new Direccion("Los arboles", "489y", "Mantecada"), "PELS021028HSRYPLA5")));
        Agente agente = new Agente();
        agente.setNombre("Pedro");
        casting.setAgente(agente);
        List<Fase> fases2 = new LinkedList<>();
//        casting.setFase(fases);
        castingDAO.agregar(casting);
        castingDAO.consultarTodos().forEach((cliente) -> { System.out.println(cliente);});
    }
    
}
