package persistencia;

import modelo.TipoDocumento;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TipoDocumentoFacade extends AbstractFacade<TipoDocumento> implements TipoDocumentoFacadeLocal{
    @PersistenceContext(unitName = "TestIteriaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoDocumentoFacade() {
        super(TipoDocumento.class);
    }
}
