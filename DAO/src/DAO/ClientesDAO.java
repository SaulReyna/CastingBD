/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Cliente;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandra
 */
public class ClientesDAO implements IClienteDAO{
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
    
    @Override
    public void insert(Cliente cliente){
        Object o = com.mongodb.util.JSON.parse("{nombre:'"+cliente.getNombre()+"',direccion:"+cliente.getDireccion()+",telefono:'"+cliente.getTelefono()+"',Persona de contacto:'"
                +cliente.getPersonaContacto()+"', Tipo de actividad:"+cliente.getActividad()+"}");
        DBObject dbObj = (DBObject) o;
        collection.insert(dbObj);
    }
    @Override
    public void eliminar(Cliente cliente){
        Object o;
        DBObject dbObj;
//        if(valor.matches("[+-]?\\d*(\\.\\d+)?")){
//                                               //raiting        //3
//            o = com.mongodb.util.JSON.parse("{"+atributo+":{$lte:"+valor+"}}");
//        }
//        else{
//            o = com.mongodb.util.JSON.parse("{"+atributo+":'"+valor+"'}");            
//        }
//        dbObj = (DBObject) o;
//        collection.remove(dbObj);
    }
    @Override
    public void getClientes(){
        DBCursor cursor=collection.find();
        
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    @Override
    public boolean getClientesNombre(String nombre){
        if(!nombre.matches("[+-]?\\d*(\\.\\d+)?")){
            DBCursor cursor=collection.find();
            if(cursor!=null){
                while(cursor.hasNext()){
                    try{
                        DBObject cursor2 = cursor.next();
                        if(cursor2.toString().contains(nombre)){
                            return true;
                        }
                    }catch(NoSuchElementException ex){
                        
                    }
                }
            }
        }
        else{
            return false;
        }
        return false;
    }
}
