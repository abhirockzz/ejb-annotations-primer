package ejbap.tx;

import javax.ejb.AfterBegin;
import javax.ejb.AfterCompletion;
import javax.ejb.BeforeCompletion;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful
//default
@TransactionManagement(TransactionManagementType.CONTAINER)
public class StatefulTxOrchestration {
    
    @PersistenceContext
    EntityManager em;
    
    //default
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void update(String id, String newMail){
        //Employee emp = em.find(Employee.class, id);
        //emp.setEmail(newMail);
    }
    
    @AfterBegin
    public void initTx(){
        System.out.println("Tx is progress..");
    }
    
    @BeforeCompletion
    public void txCommitCallback(){
        System.out.println("Tx about to be committed..");
    }
    
    @AfterCompletion
    public void afterTx(boolean isCommitted){
        System.out.println("Tx committed? " + isCommitted);
    }
}
