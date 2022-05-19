/*
 * Fase.java
 */
package entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

public class Fase {
    private int id;
    private Date fechaInicio;
    private List<ObjectId> idsPruebas;
    private List<Prueba> pruebas;
    private Casting casting;

    public Fase() {
    }

    public Fase(int numero, Date fechaInicio, List<ObjectId> idsPruebas, List<Prueba> pruebas) {
        this.id = numero;
        this.fechaInicio = fechaInicio;
        this.idsPruebas = idsPruebas;
        this.pruebas = pruebas;
    }

    public Fase(int numero, Date fechaInicio) {
        this.id = numero;
        this.fechaInicio = fechaInicio;
    }

    public int getNumero() {
        return id;
    }

    public void setNumero(int numero) {
        this.id = numero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public List<ObjectId> getIdsPruebas() {
        return idsPruebas;
    }

    public void setIdsPruebas(List<ObjectId> idsPruebas) {
        this.idsPruebas = idsPruebas;
    }

    public Casting getCasting() {
        return casting;
    }

    public void setCasting(Casting casting) {
        this.casting = casting;
    }

    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Fase{numFase="+id + ", fecha=" + fechaInicio+", Casting="+ casting+'}';
    }

}
