/*
 * CastingPresencial.java
 */
package entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public class CastingPresencial extends Casting {
    private int numPersonas;

    public CastingPresencial() {
    }

    public CastingPresencial(long numCasting, int numPersonas, Cliente cliente, String descripcion, String nombre, Direccion direccion, Date fechaContratacion, ObjectId idCliente, float costo, Agente agente, List<Fase> fases, String tipo) {
        super(numCasting, cliente, nombre, fechaContratacion, costo, agente, descripcion, tipo);
        this.numPersonas = numPersonas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.numPersonas;
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
        final CastingPresencial other = (CastingPresencial) obj;
        if (this.numPersonas != other.numPersonas) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CastingPresencial{" + "numPersonas=" + numPersonas + '}';
    }

}
