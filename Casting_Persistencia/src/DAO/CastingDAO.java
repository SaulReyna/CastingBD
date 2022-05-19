/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.ICastingDAO;
import Interfaces.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Casting;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

public class CastingDAO implements ICastingDAO{
    private MongoDatabase baseDatos;
    
    public CastingDAO(MongoDatabase conexion) {
        this.baseDatos = conexion;
    }
    
    private MongoCollection<Casting> getColeccion(){
        return this.baseDatos.getCollection("Casting", Casting.class);
    }
    
    @Override
    public boolean agregar(Casting casting) {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Casting> coleccion = this.getColeccion();
//        System.out.println(casting.getFases());
        coleccion.insertOne(casting);
        return true;
    }
    
    @Override
    public boolean eliminar(Casting casting) {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
//        MongoCollection<Cliente> coleccion = this.getColeccion();
        return true;
    }

    @Override
    public List<Casting> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Casting> coleccion = this.getColeccion();
        List<Casting> listaCastings = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaCastings);
        return listaCastings;
    }
    
    @Override
    public List<Casting> getCastingID(long idCliente) {
        MongoCollection<Casting> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("numCasting", idCliente)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Casting> Castings = new LinkedList<>();
        coleccion.aggregate(etapas).into(Castings);
        if (Castings.isEmpty()){
            return null;
        }else{
            return Castings;
        }
    }
    
    @Override
    public List<Casting> getCastingNombre(String nombre){
        MongoCollection<Casting> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("nombre", nombre)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Casting> Castings = new LinkedList<>();
        coleccion.aggregate(etapas).into(Castings);
        if (Castings.isEmpty()){
            return null;
        }else{
            return Castings;
        }
    }
    
    @Override
    public List<Casting> castingVigente(Date fecha){
        MongoCollection<Casting> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("fecha", fecha)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Casting> Castings = new LinkedList<>();
        coleccion.aggregate(etapas).into(Castings);
        if (Castings.isEmpty()){
            return null;
        }else{
            return Castings;
        }
    }
}
