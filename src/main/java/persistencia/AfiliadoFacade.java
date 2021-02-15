package persistencia;

import modelo.Afiliado;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AfiliadoFacade extends AbstractFacade<Afiliado> implements AfiliadoFacadeLocal{
    @PersistenceContext(unitName = "TestIteriaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AfiliadoFacade() {
        super(Afiliado.class);
    }
}
