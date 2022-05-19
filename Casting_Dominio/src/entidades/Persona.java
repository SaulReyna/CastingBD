/*
 * Persona.java
 */
package entidades;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String telefono;
    private Direccion direccion;
    private String curp;

    public Persona() {
    }

    public Persona(String nombre, String telefono, Direccion direccion, String curp) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.curp = curp;
    }

    public Persona(String nombre, String telefono, String curp) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.curp = curp;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + Objects.hashCode(this.telefono);
        hash = 31 * hash + Objects.hashCode(this.direccion);
        hash = 31 * hash + Objects.hashCode(this.curp);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.curp, other.curp)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  nombre + ", telefono: " + telefono + ", direccion: " + direccion + ", curp: " + curp;
    }
    
}
