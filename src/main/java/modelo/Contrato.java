package modelo;

import javax.persistence.*;
import java.util.Date;

public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cto_id")
    private Integer ctoId;

    @JoinColumn(name = "afi_id", referencedColumnName = "afi_id")
    @ManyToOne(optional = false)
    private Afiliado afiId;

    @Column(name = "pln_id")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pln_id")
    private Plan plnId;

    @Column(name = "cto_cantidad_usuarios")
    private Integer ctoCantidadUsuarios;

    @Column(name = "cto_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "cto_fecha_retiro")
    @Temporal(TemporalType.DATE)
    private Date fechaRetiro;

    @Column(name = "cto_fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;


    @Column(name = "cto_eps")
    private String ctoEps;

    public Contrato(){

    }

    public Integer getCtoId() {
        return ctoId;
    }

    public void setCtoId(Integer ctoId) {
        this.ctoId = ctoId;
    }

    public Afiliado getAfiId() {
        return afiId;
    }

    public void setAfiId(Afiliado afiId) {
        this.afiId = afiId;
    }

    public Plan getPlnId() {
        return plnId;
    }

    public void setPlnId(Plan plnId) {
        this.plnId = plnId;
    }

    public Integer getCtoCantidadUsuarios() {
        return ctoCantidadUsuarios;
    }

    public void setCtoCantidadUsuarios(Integer ctoCantidadUsuarios) {
        this.ctoCantidadUsuarios = ctoCantidadUsuarios;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCtoEps() {
        return ctoEps;
    }

    public void setCtoEps(String ctoEps) {
        this.ctoEps = ctoEps;
    }
}
