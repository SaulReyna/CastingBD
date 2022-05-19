/*
 * Clientes
 */
package DAO;

import Interfaces.IClienteDAO;
import Interfaces.IConexionBD;
import com.mongodb.client.ClientSession;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Cliente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class ClientesDAO implements IClienteDAO {

    private MongoDatabase baseDatos;
    
    public ClientesDAO(MongoDatabase conexion) {
        this.baseDatos = conexion;
    }
    
    private MongoCollection<Cliente> getColeccion(){
        return this.baseDatos.getCollection("Cliente", Cliente.class);
    }
    
    @Override
    public boolean agregar(Cliente cliente) {
        MongoCollection<Cliente> coleccion = this.getColeccion();
        coleccion.insertOne(cliente);
        return true;
    }
    
    @Override
    public boolean eliminar(Cliente cliente) {
        MongoCollection<Cliente> coleccion = this.getColeccion();
        coleccion.deleteOne(eq("nombre",cliente.getNombre()));
        return true;
    }

    @Override
    public List<Cliente> consultarTodos() {
        MongoCollection<Cliente> coleccion = this.getColeccion();
        List<Cliente> listaClientes = new LinkedList<>();
        coleccion.find(
        ).into(listaClientes);
        return listaClientes;
    }

    @Override
    public Cliente consultar(long idCliente) {
        MongoCollection<Cliente> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("numCliente", idCliente)));
        etapas.add(new Document()
            .append("$lookup", new Document()
                .append("from", "repartidores")
                .append("localField", "idsRepartidores")
                .append("foreignField", "_id")
                .append("as", "repartidores")));
        List<Cliente> clientes = new LinkedList<>();
        coleccion.aggregate(etapas).into(clientes);
        if (clientes.isEmpty()){
            return null;
        }else{
            return clientes.get(0);
        }
    }
    
    @Override
    public Cliente consultarNombre(String nombre){
        MongoCollection<Cliente> coleccion = this.getColeccion();
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
        List<Cliente> clientes = new LinkedList<>();
        coleccion.aggregate(etapas).into(clientes);
        if (clientes.isEmpty()){
            return null;
        }else{
            return clientes.get(0);
        }
    }
    
}
