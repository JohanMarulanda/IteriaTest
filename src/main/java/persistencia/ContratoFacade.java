package persistencia;

import modelo.Contrato;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ContratoFacade extends AbstractFacade<Contrato> implements ContratoFacadeLocal {
    @PersistenceContext(unitName = "TestIteriaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContratoFacade() {
        super(Contrato.class);
    }
}
