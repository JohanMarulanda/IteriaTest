package modelo;

import javax.persistence.*;
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tdc_id")
    private Integer tdcId;
    @Column(name = "tdc_nombre")
    private String tdcNombre;
    @Column(name = "tdc_estado")

    private Integer tdcEstado;

    public TipoDocumento(){

    }

    public Integer getTdcId() {
        return tdcId;
    }

    public void setTdcId(Integer tdcId) {
        this.tdcId = tdcId;
    }

    public String getTdcNombre() {
        return tdcNombre;
    }

    public void setTdcNombre(String tdcNombre) {
        this.tdcNombre = tdcNombre;
    }

    public Integer getTdcEstado() {
        return tdcEstado;
    }

    public void setTdcEstado(Integer tdcEstado) {
        this.tdcEstado = tdcEstado;
    }
}
