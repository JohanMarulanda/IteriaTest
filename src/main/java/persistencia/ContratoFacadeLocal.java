package persistencia;

import modelo.Contrato;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ContratoFacadeLocal {
    void create(Contrato factura);

    void edit(Contrato factura);

    void remove(Contrato factura);

    Contrato find(Object id);

    List<Contrato> findAll();

    List<Contrato> findRange(int[] range);

    int count();
}
