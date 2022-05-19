/*
 * Agente.java
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

public class Agente extends Persona{
    private ObjectId id;
    private long numEmpleado;
    private String RFC;

    public Agente() {
    }

    public Agente(ObjectId id, long numEmpleado, String RFC, String nombre, String telefono, Direccion direccion, String curp) {
        super(nombre, telefono, direccion, curp);
        this.id = id;
        this.numEmpleado = numEmpleado;
        this.RFC = RFC;
    }

    public Agente(long numEmpleado, String RFC, String nombre, String telefono, Direccion direccion, String curp) {
        super(nombre, telefono, direccion, curp);
        this.numEmpleado = numEmpleado;
        this.RFC = RFC;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public long getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(long numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + (int) (this.numEmpleado ^ (this.numEmpleado >>> 32));
        hash = 83 * hash + Objects.hashCode(this.RFC);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agente other = (Agente) obj;
        if (this.numEmpleado != other.numEmpleado) {
            return false;
        }
        if (!Objects.equals(this.RFC, other.RFC)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agente{" + "id: " + numEmpleado +", Nombre: "+getNombre()+", Telefono: "+ getTelefono()+", CURP: "+ getCurp()+ ", RFC: " + RFC + '}';
    }
    
}
