package persistencia;

import modelo.Plan;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PlanFacade extends AbstractFacade<Plan> implements PlanFacadeLocal{
    @PersistenceContext(unitName = "TestIteriaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
            return em;
            }

    public PlanFacade() {
        super(Plan.class);
    }
}
