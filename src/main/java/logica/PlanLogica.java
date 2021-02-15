package logica;

import modelo.Plan;
import modelo.TipoDocumento;
import persistencia.PlanFacadeLocal;
import persistencia.TipoDocumentoFacadeLocal;

import javax.ejb.EJB;
import java.util.List;

public class PlanLogica implements PlanLogicaLocal{
    @EJB
    private PlanFacadeLocal planDAO;

    @Override
    public List<Plan> listAll() {
        return planDAO.findAll();
    }

    @Override
    public void store(Plan p) throws Exception {
        if (p == null) {
            throw new Exception("El documento no tiene información");
        }

        if (p.getPlnNombre().equals("")) {
            throw new Exception("El nombre es requerido");
        }

        if (p.getFechaInicio().equals("")) {
            throw new Exception("La fecha inicial es requerida");
        }
        planDAO.create(p);
    }

    @Override
    public void update(Plan p) throws Exception {
        if (p == null) {
            throw new Exception("El documento no tiene información");
        }

        if (p.getPlnNombre().equals("")) {
            throw new Exception("El nombre es requerido");
        }

        if (p.getFechaInicio().equals("")) {
            throw new Exception("La fecha inicial es requerida");
        }
        planDAO.edit(p);
    }

    @Override
    public void delete(Plan p) throws Exception {
        Plan plan = planDAO.find(p.getPlnId());

        if (plan == null) {
            throw new Exception("El plan no existe");
        }
        planDAO.remove(plan);
    }
}
