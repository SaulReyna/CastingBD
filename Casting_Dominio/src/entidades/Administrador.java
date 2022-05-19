/*
 * Administrador.java
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

public class Administrador extends Persona {
    private ObjectId id;
    private String usuario;
    private String contraseña;

    public Administrador() {
    }

    public Administrador(ObjectId id, String usuario, String contraseña, String nombre, String telefono, Direccion direccion, String curp) {
        super(nombre, telefono, direccion, curp);
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Administrador(String usuario, String contraseña, String nombre, String telefono, String curp) {
        super(nombre, telefono, curp);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.usuario);
        hash = 29 * hash + Objects.hashCode(this.contraseña);
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
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrador{" + "id=" + id + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
}
