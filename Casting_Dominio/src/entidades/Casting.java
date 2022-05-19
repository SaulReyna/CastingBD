/*
 * Casting.java
 */
package entidades;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

public class Casting {
    private ObjectId id;
    private long numCasting;
    private String nombre;
    private String descripcion;
    private Date fechaContratacion;
    private Cliente cliente;
    private float costo;
    private Agente agente;
    private String tipo;
    private List<ObjectId> idsPerfiles;

    public Casting() {
    }

    public Casting(long numCasting, Cliente cliente, String nombre, Date fechaContratacion, float costo, Agente agente, String descripcion, String tipo) {
        this.numCasting = numCasting;
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.cliente = cliente;
        this.costo = costo;
        this.descripcion = descripcion;
        this.agente = agente;
        this.tipo=tipo;
    }

    public Casting(String nombre, Direccion direccion, Date fechaContratacion, Cliente cliente, float costo, Agente agente, List<Perfil> perfiles) {
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
        this.cliente = cliente;
        this.costo = costo;
        this.agente = agente;
        this.idsPerfiles = idsPerfiles;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public long getNumCasting() {
        return numCasting;
    }

    public void setNumCasting(long numCasting) {
        this.numCasting = numCasting;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public List<ObjectId> getIdsPerfiles() {
        return idsPerfiles;
    }

    public void setIdsPerfiles(List<ObjectId> idsPerfiles) {
        this.idsPerfiles = idsPerfiles;
    }
//
//    public Fase getFases() {
//        return fases;
//    }
//
//    public void setFase(Fase fases) {
//        this.fases = fases;
//    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.fechaContratacion);
        hash = 83 * hash + Objects.hashCode(this.cliente);
        hash = 83 * hash + Float.floatToIntBits(this.costo);
        hash = 83 * hash + Objects.hashCode(this.agente);
        hash = 83 * hash + Objects.hashCode(this.idsPerfiles);
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
        final Casting other = (Casting) obj;
        if (Float.floatToIntBits(this.costo) != Float.floatToIntBits(other.costo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }

        if (!Objects.equals(this.fechaContratacion, other.fechaContratacion)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.agente, other.agente)) {
            return false;
        }
        if (!Objects.equals(this.idsPerfiles, other.idsPerfiles)) {
            return false;
        }
//        if (!Objects.equals(this.fases, other.fases)) {
//            return false;
//        }
        return true;
    }
    
//    public String toStringFases(){
//        String fasesS="[";
//        for(int i=0;fases.size()>i; i++){
//           fasesS = fasesS + "{numFase: "+fases.get(i).getNumero() + ", fecha: "+fases.get(1).getFechaInicio()+'}';
//        }
//        return fasesS+']';
//    }

    @Override
    public String toString() {
        return  "Casting{numCasting="+ numCasting +", nombre=" + nombre + ", fechaContratacion=" + fechaContratacion + ", tipo="+ tipo+", costo=" + costo + ", descripcion=" + descripcion + ", cliente=" + cliente +", agente="+ agente +'}';
    }

    
}
