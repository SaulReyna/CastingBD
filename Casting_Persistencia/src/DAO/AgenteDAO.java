
package DAO;

import Interfaces.IAgenteDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Agente;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

public class AgenteDAO implements IAgenteDAO{
    private MongoDatabase baseDatos;

    public AgenteDAO(MongoDatabase conexion) {
        this.baseDatos = conexion;
    }
    
    private MongoCollection<Agente> getColeccion(){
        return this.baseDatos.getCollection("Agente", Agente.class);
    }
    @Override
    public boolean agregar(Agente agente) {
        MongoCollection<Agente> coleccion = this.getColeccion();
        coleccion.insertOne(agente);
        return true;
    }

    @Override
    public boolean eliminar(Agente agente) {
       MongoCollection<Agente> coleccion = this.getColeccion();
        coleccion.deleteOne(eq("nombre",agente.getNombre()));
        return true;
    }

    @Override
    public List<Agente> consultarTodos() {
        MongoCollection<Agente> coleccion = this.getColeccion();
        List<Agente> listaAgente = new LinkedList<>();
        coleccion.find().into(listaAgente);
        return listaAgente;
    }

    @Override
    public Agente consultar(long idAgente) {
        MongoCollection<Agente> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("numEmpleado", idAgente)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Agente> agentes = new LinkedList<>();
        coleccion.aggregate(etapas).into(agentes);
        if (agentes.isEmpty()) {
            return null;
        } else {
            return agentes.get(0);
        }
    }

    @Override
    public Agente consultarNombre(String nombre) {
        MongoCollection<Agente> coleccion = this.getColeccion();
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
        List<Agente> agentes = new LinkedList<>();
        coleccion.aggregate(etapas).into(agentes);
        if (agentes.isEmpty()) {
            return null;
        } else {
            return agentes.get(0);
        }
    }

}
