package persistencia;

import modelo.Afiliado;
import javax.ejb.Local;
import java.util.List;

@Local
public interface AfiliadoFacadeLocal {
    void create(Afiliado afiliado);

    void edit(Afiliado afiliado);

    void remove(Afiliado afiliado);

    Afiliado find(Object id);

    List<Afiliado> findAll();

    List<Afiliado> findRange(int[] range);

    int count();
}
