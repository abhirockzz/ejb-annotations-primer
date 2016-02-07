package ejbap.views.nointerface;

import java.util.Date;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean //does not make a difference
public class AttachmentManagerBean {
    
    @PersistenceContext
    private EntityManager em;
    
    public void createAttachment(){
        //use EM
    }
    
    public Date getAttachmentCreateDate(){
        //use EM
        return new Date(); //created just now!
    }

}
