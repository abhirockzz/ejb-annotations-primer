package ejbap.di_and_ri;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TimeKeeperJSFController {
    
    @EJB
    TimeKeeper keeper;
    
    public String getDateTime(){
        return keeper.dateTime();
    }
}
