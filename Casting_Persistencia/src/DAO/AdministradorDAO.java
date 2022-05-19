/*
 * AdministradorDAO.java
 */
package DAO;

import Interfaces.IAdministradorDAO;
import Interfaces.IConexionBD;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Administrador;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

public class AdministradorDAO implements IAdministradorDAO{
    
    private MongoDatabase baseDatos;
    
    public AdministradorDAO(MongoDatabase conexion) {
        this.baseDatos = conexion;
    }
    
    private MongoCollection<Administrador> getColeccion(){
        return this.baseDatos.getCollection("Administrador", Administrador.class);
    }
    
    @Override
    public boolean agregar(Administrador administrador) {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Administrador> coleccion = this.getColeccion();
        coleccion.insertOne(administrador);
        return true;
    }

    @Override
    public List<Administrador> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Administrador> coleccion = this.getColeccion();
        List<Administrador> listaAdministrador = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaAdministrador);
        return listaAdministrador;
    }
    
    @Override
    public Administrador consultarUsuario(String usuario){
        MongoCollection<Administrador> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("usuario", usuario)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Administrador> Administradores = new LinkedList<>();
        coleccion.aggregate(etapas).into(Administradores);
        if (Administradores.isEmpty()){
            return null;
        }else{
            return Administradores.get(0);
        }
    }
}
