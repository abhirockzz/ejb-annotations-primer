package ejbap.views.local;
import ejbap.views.local.interfaces.UserRepositoryInterface;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Local(UserRepositoryInterface.class)
public class DBUserRepository implements UserRepositoryInterface {

    @PersistenceContext
    private EntityManager em;

    @Override
    public String getUserFirstName(String id) {
        //use EM
        return "";
    }

    @Override
    public String getUserEmail(String id) {
        //use EM
        return "";
    }

}
