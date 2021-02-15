package logica;

import modelo.Plan;
import modelo.TipoDocumento;

import java.util.List;

public interface PlanLogicaLocal {
    public List<Plan> listAll();

    public void store(Plan p) throws Exception;

    public void update(Plan p) throws Exception;

    public void delete(Plan p) throws Exception;
}
