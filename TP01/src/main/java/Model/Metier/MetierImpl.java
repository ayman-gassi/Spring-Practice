package Model.Metier;

import Model.DAO.IDao;
import Model.Metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao = null;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {
    }
    @Override
    public double calculer() {
        double d =dao.getData();
        return  d*13;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
