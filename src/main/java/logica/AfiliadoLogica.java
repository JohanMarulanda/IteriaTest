package logica;

import modelo.Afiliado;
import persistencia.AfiliadoFacadeLocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class AfiliadoLogica implements AfiliadoLogicaLocal{
    @EJB
    private AfiliadoFacadeLocal afiliadoDAO;

    @Override
    public List<Afiliado> listAll() {
        return afiliadoDAO.findAll();
    }

    @Override
    public void store(Afiliado a) throws Exception {

    }

    @Override
    public void update(Afiliado a) throws Exception {

    }

    @Override
    public void delete(Afiliado a) throws Exception {

    }

    @Override
    public Afiliado find(Integer id) throws Exception {
        return null;
    }
}
