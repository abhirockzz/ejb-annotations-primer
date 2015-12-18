package ejbap.core;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Stateful
public class StatefulBeanWithExtendedPersistenceContext {
    
    @PersistenceContext(type = PersistenceContextType.EXTENDED)
    EntityManager em;
    
    public void findUser(final String userID){
        //use EM to find user
        //User user = em.find(User.class, userID);
    }
}
