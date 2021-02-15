package modelo;

import javax.persistence.*;
import java.util.Date;

public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pln_id")
    private Integer plnId;
    @Column(name = "pln_nombre")
    private String plnNombre;

    @Column(name = "pln_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "pln_fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @Column(name = "pln_estado")
    private Integer plnEstado;

    public Plan(){

    }

    public Integer getPlnId() {
        return plnId;
    }

    public void setPlnId(Integer plnId) {
        this.plnId = plnId;
    }

    public String getPlnNombre() {
        return plnNombre;
    }

    public void setPlnNombre(String plnNombre) {
        this.plnNombre = plnNombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getPlnEstado() {
        return plnEstado;
    }

    public void setPlnEstado(Integer plnEstado) {
        this.plnEstado = plnEstado;
    }
}
