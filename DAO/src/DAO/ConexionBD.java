/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandra
 */
public class ConexionBD {
    DB database;
    DBCollection collection;
    public void crearConexion(){
        MongoClient mongo=null;
        
        try{
            
            mongo= new MongoClient("localhost",27017);
            System.out.println("Connected to the database successfully");
            database=mongo.getDB("Casting");
            collection=database.getCollection("Clientes");
        }
        
        catch(MongoException ex){
            JOptionPane.showMessageDialog(null, "Error de conexion "+ex.toString());
        }
    
    }
}
