package persistencia;

import modelo.TipoDocumento;

import javax.ejb.Local;
import java.util.List;

@Local
public interface TipoDocumentoFacadeLocal {
    void create(TipoDocumento documento);

    void edit(TipoDocumento documento);

    void remove(TipoDocumento documento);

    TipoDocumento find(Object id);

    List<TipoDocumento> findAll();

    List<TipoDocumento> findRange(int[] range);

    int count();
}
