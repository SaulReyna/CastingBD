/*
 * CandidatosAprobados.java
 */
package entidades;

import java.util.List;
import org.bson.types.ObjectId;

public class CandidatosAprobados {
    private List<ObjectId> idsCandidatosAprobados;
    private List<Candidato> candidatosElectos;
    private Object casting;

    public CandidatosAprobados() {
    }

    public CandidatosAprobados(List<ObjectId> idsCandidatosAprobados, List<Candidato> candidatosElectos, Object casting) {
        this.idsCandidatosAprobados = idsCandidatosAprobados;
        this.candidatosElectos = candidatosElectos;
        this.casting = casting;
    }

    public List<ObjectId> getIdsCandidatosAprobados() {
        return idsCandidatosAprobados;
    }

    public void setIdsCandidatosAprobados(List<ObjectId> idsCandidatosAprobados) {
        this.idsCandidatosAprobados = idsCandidatosAprobados;
    }

    public List<Candidato> getCandidatosElectos() {
        return candidatosElectos;
    }

    public void setCandidatosElectos(List<Candidato> candidatosElectos) {
        this.candidatosElectos = candidatosElectos;
    }

    public Object getCasting() {
        return casting;
    }

    public void setCasting(Object casting) {
        this.casting = casting;
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
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
