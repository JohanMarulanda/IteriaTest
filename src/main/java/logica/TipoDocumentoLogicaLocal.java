package logica;

import modelo.TipoDocumento;

import java.util.List;

public interface TipoDocumentoLogicaLocal {
    public List<TipoDocumento> listAll();

    public void store(TipoDocumento d) throws Exception;

    public void update(TipoDocumento d) throws Exception;

    public void delete(TipoDocumento d) throws Exception;
}
