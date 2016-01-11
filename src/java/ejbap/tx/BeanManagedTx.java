package ejbap.tx;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.UserTransaction;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class BeanManagedTx {
    @Resource
    private UserTransaction uTx;
    
    public void save() throws Exception{
        try {
            uTx.begin();
            //perform operation
            uTx.commit();
        } catch (Exception ex) {
            uTx.rollback();
        } 
    }
}
