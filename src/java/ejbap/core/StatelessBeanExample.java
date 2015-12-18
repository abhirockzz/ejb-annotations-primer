package ejbap.core;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StatelessBeanExample {
    
    @PersistenceContext
    private EntityManager em;
    
    public void deleteComment(String id){
        em.remove(id);
    }
}
