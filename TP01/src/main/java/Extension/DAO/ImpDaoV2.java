package Extension.DAO;

import Model.DAO.IDao;
import org.springframework.stereotype.Component;

@Component
public class ImpDaoV2 implements IDao {
    @Override
    public double getData() {
        return 1;
    }
}
