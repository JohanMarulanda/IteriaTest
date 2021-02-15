package logica;

import modelo.Contrato;
import persistencia.ContratoFacadeLocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ContratoLogica implements ContratoLogicaLocal  {
    @EJB
    private ContratoFacadeLocal contratoDAO;

    @Override
    public List<Contrato> listAll() {
        return contratoDAO.findAll();
    }

    @Override
    public void store(Contrato c) throws Exception {
        if (c == null) {
            throw new Exception("El contrato no tiene información");
        }

        if (c.getCtoId().equals("")) {
            throw new Exception("El contrato es requerido");
        }

        if (c.getFechaInicio().equals("")) {
            throw new Exception("La fecha inicio es requerida");
        }

        contratoDAO.create(c);
    }

    @Override
    public void update(Contrato c) throws Exception {
        if (c == null) {
            throw new Exception("El contrato no tiene información");
        }

        if (c.getCtoId().equals("")) {
            throw new Exception("El contrato es requerido");
        }

        if (c.getFechaInicio().equals("")) {
            throw new Exception("La fecha inicio es requerida");
        }

        contratoDAO.edit(c);
    }

    @Override
    public void delete(Contrato c) throws Exception {
        Contrato contrato = contratoDAO.find(c.getCtoId());

        if (contrato == null) {
            throw new Exception("El contrato no existe");
        }
        contratoDAO.remove(contrato);
    }

}
