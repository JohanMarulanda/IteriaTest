package modelo;

import javax.persistence.*;

@Entity
@Table(name = "afiliado")
public class Afiliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "afi_id")
    private Integer afiId;

    @Column(name = "afi_nombre")
    private String afiNombre;

    @Column(name = "afi_apellidos")
    private String afiApellidos;

    @Column(name = "tdc_id")
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "afiId")
    private TipoDocumento tdcId;

    @Column(name = "afi_documento")
    private Integer afiDocumento;

    @Column(name = "afi_direccion")
    private String afiDireccion;
    @Column(name = "afi_telefono")
    private Integer afiTelefono;
    @Column(name = "afi_mail")
    private String afiMail;
    @Column(name = "afi_estado")
    private Integer afiEstado;

    public Afiliado(){

    }

    public Integer getAfiId() {
        return afiId;
    }

    public void setAfiId(Integer afiId) {
        this.afiId = afiId;
    }

    public String getAfiNombre() {
        return afiNombre;
    }

    public void setAfiNombre(String afiNombre) {
        this.afiNombre = afiNombre;
    }

    public String getAfiApellidos() {
        return afiApellidos;
    }

    public void setAfiApellidos(String afiApellidos) {
        this.afiApellidos = afiApellidos;
    }

    public TipoDocumento getTdcId() {
        return tdcId;
    }

    public void setTdcId(TipoDocumento tdcId) {
        this.tdcId = tdcId;
    }

    public Integer getAfiDocumento() {
        return afiDocumento;
    }

    public void setAfiDocumento(Integer afiDocumento) {
        this.afiDocumento = afiDocumento;
    }

    public String getAfiDireccion() {
        return afiDireccion;
    }

    public void setAfiDireccion(String afiDireccion) {
        this.afiDireccion = afiDireccion;
    }

    public Integer getAfiTelefono() {
        return afiTelefono;
    }

    public void setAfiTelefono(Integer afiTelefono) {
        this.afiTelefono = afiTelefono;
    }

    public String getAfiMail() {
        return afiMail;
    }

    public void setAfiMail(String afiMail) {
        this.afiMail = afiMail;
    }

    public Integer getAfiEstado() {
        return afiEstado;
    }

    public void setAfiEstado(Integer afiEstado) {
        this.afiEstado = afiEstado;
    }
}
