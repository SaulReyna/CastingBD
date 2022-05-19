/*
 * Cliente.java
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

public class Cliente {
    private long numCliente;
    private String nombre;
    private Direccion direccion;
    private String telefono;
    private String actividad;
    private Persona personaContacto;

    public Cliente() {
    }

    public Cliente(long id, String nombre, Direccion direccion, String telefono, String actividad, Persona personaContacto) {
        this.numCliente = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.actividad = actividad;
        this.personaContacto = personaContacto;
    }

    public Cliente(String nombre, Direccion direccion, String telefono, String actividad, Persona personaContacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.actividad = actividad;
        this.personaContacto = personaContacto;
    }

    public long getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(long numCliente) {
        this.numCliente = numCliente;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Persona getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(Persona personaContacto) {
        this.personaContacto = personaContacto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.numCliente);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.direccion);
        hash = 59 * hash + Objects.hashCode(this.telefono);
        hash = 59 * hash + Objects.hashCode(this.actividad);
        hash = 59 * hash + Objects.hashCode(this.personaContacto);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.numCliente, other.numCliente)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (this.actividad != other.actividad) {
            return false;
        }
        if (!Objects.equals(this.personaContacto, other.personaContacto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + numCliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", actividad=" + actividad + ", personaContacto=" + personaContacto.getNombre() + '}';
    }

}

enum tipoActividad{
    MODA, CINE;
}
