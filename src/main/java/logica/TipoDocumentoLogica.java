package logica;

import modelo.TipoDocumento;
import persistencia.TipoDocumentoFacadeLocal;

import javax.ejb.EJB;
import java.util.List;

public class TipoDocumentoLogica implements TipoDocumentoLogicaLocal{

    @EJB
    private TipoDocumentoFacadeLocal tipoDocumentoDAO;

    @Override
    public List<TipoDocumento> listAll() {
        return tipoDocumentoDAO.findAll();
    }

    @Override
    public void store(TipoDocumento d) throws Exception {
        if (d == null) {
            throw new Exception("El documento no tiene información");
        }

        if (d.getTdcNombre().equals("")) {
            throw new Exception("El nombre es requerido");
        }

        if (d.getTdcEstado().equals("")) {
            throw new Exception("El estado es requerido");
        }
        tipoDocumentoDAO.create(d);
    }

    @Override
    public void update(TipoDocumento d) throws Exception {
        if (d == null) {
            throw new Exception("El documento no tiene información");
        }

        if (d.getTdcNombre().equals("")) {
            throw new Exception("El nombre es requerido");
        }

        if (d.getTdcEstado().equals("")) {
            throw new Exception("El estado es requerido");
        }
        tipoDocumentoDAO.edit(d);
    }

    @Override
    public void delete(TipoDocumento d) throws Exception {
        TipoDocumento documento = tipoDocumentoDAO.find(d.getTdcId());

        if (documento == null) {
            throw new Exception("El documento no existe");
        }
        tipoDocumentoDAO.remove(documento);
    }
}
