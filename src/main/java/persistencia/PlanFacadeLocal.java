package persistencia;

import modelo.Plan;
import modelo.TipoDocumento;

import java.util.List;

public interface PlanFacadeLocal {
    void create(Plan plan);

    void edit(Plan plan);

    void remove(Plan plan);

    Plan find(Object id);

    List<Plan> findAll();

    List<Plan> findRange(int[] range);

    int count();
}
