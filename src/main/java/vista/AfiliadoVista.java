package vista;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import logica.AfiliadoLogicaLocal;
import modelo.Afiliado;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.event.SelectEvent;

@ManagedBean
@RequestScoped
public class AfiliadoVista {
    @EJB
    private AfiliadoLogicaLocal afiliadologica;

    private List<Afiliado> listaAfiliados;

    private InputText txtNombre;
    private InputText txtApellidos;
    private InputText txtDocumento;
    private InputText txtDireccion;
    private InputText txtTelefono;

    private Afiliado selectedAfiliado;

    /**
     * Creates a new instance of ClienteVista
     */
    public AfiliadoVista() {
    }

    public List<Afiliado> getListaAfiliados() {
        listaAfiliados = afiliadologica.listAll();
        return listaAfiliados;
    }

    public void setListaAfiliados(List<Afiliado> listaAfiliados) {
        this.listaAfiliados = listaAfiliados;
    }

    public AfiliadoLogicaLocal getClienteLogica() {
        return afiliadologica;
    }

    public void setAfiliadologica(AfiliadoLogicaLocal afiliadologica) {
        this.afiliadologica = afiliadologica;
    }

    public InputText getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(InputText txtNombre) {
        this.txtNombre = txtNombre;
    }

    public InputText getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(InputText txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public InputText getTxtDocumento() {
        return txtDocumento;
    }

    public void setTxtDocumento(InputText txtDocumento) {
        this.txtDocumento = txtDocumento;
    }

    public InputText getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(InputText txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public Afiliado getSelectedAfiliado() {
        return selectedAfiliado;
    }

    public void setSelectedAfiliado(Afiliado selectedAfiliado) {
        this.selectedAfiliado = selectedAfiliado;
    }

    public void limpiarCampos() {
        txtNombre.setValue("");
        txtApellidos.setValue("");
        txtDocumento.setValue("");
        txtDireccion.setValue("");
        txtTelefono.setValue("");
    }

    public void seleccionarAfiliado(SelectEvent e) {
        selectedAfiliado = (Afiliado) e.getObject();
        txtNombre.setValue(selectedAfiliado.getAfiNombre());
        txtApellidos.setValue(selectedAfiliado.getAfiApellidos());
        txtDocumento.setValue(selectedAfiliado.getAfiDocumento();
        txtDireccion.setValue(selectedAfiliado.getAfiDireccion());
        txtTelefono.setValue(selectedAfiliado.getAfiTelefono());
    }

    public void nuevoAfiliado() {
        try {
            String nombre = txtNombre.getValue().toString();
            String apellidos = txtApellidos.getValue().toString();
            Integer documento = txtDocumento.getValue();
            String direccion = txtDireccion.getValue().toString();
            Integer telefono = txtTelefono.getValue();

            Afiliado nuevoAfiliado = new Afiliado();
            nuevoAfiliado.setAfiNombre(nombre);
            nuevoAfiliado.setAfiApellidos(apellidos);
            nuevoAfiliado.setAfiDocumento(documento);
            nuevoAfiliado.setAfiDireccion(direccion);
            nuevoAfiliado.setAfiTelefono(telefono);

            afiliadologica.store(nuevoAfiliado);
            limpiarCampos();

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Mensaje", ex.getMessage()));
        }
    }

    public void actualizarCliente() {
        try {
            String nombre = txtNombre.getValue().toString();
            String apellidos = txtApellidos.getValue().toString();
            Integer documento = txtDocumento.getValue();
            String direccion = txtDireccion.getValue().toString();
            Integer telefono = txtTelefono.getValue();

            Afiliado afiliado = selectedAfiliado;
            afiliado.setAfiNombre(nombre);
            afiliado.setAfiApellidos(apellidos);
            afiliado.setAfiDocumento(documento);
            afiliado.setAfiDireccion(direccion);
            afiliado.setAfiTelefono(telefono);

            afiliadologica.update(afiliado);
            limpiarCampos();

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Mensaje", ex.getMessage()));
        }
    }

    public void eliminarCliente() {
        try {
            afiliadologica.delete(selectedAfiliado);
            limpiarCampos();

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensaje", "Afiliado eliminado"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Mensaje", ex.getMessage()));
        }
    }
}
