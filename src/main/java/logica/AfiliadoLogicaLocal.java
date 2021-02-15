package logica;

import modelo.Afiliado;
import javax.ejb.Local;
import java.util.List;

@Local
public interface AfiliadoLogicaLocal {

    public List<Afiliado> listAll();

    public void store(Afiliado c) throws Exception;

    public void update(Afiliado c) throws Exception;

    public void delete(Afiliado c) throws Exception;

    public Afiliado find(Integer id) throws Exception;
}
