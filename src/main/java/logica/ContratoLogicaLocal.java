package logica;

import modelo.Contrato;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ContratoLogicaLocal {
    public List<Contrato> listAll();

    public void store(Contrato f) throws Exception;

    public void update(Contrato f) throws Exception;

    public void delete(Contrato f) throws Exception;
}
