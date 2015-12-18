package ejbap.di_and_ri;

import javax.ejb.EJB;

public class TimeKeeperEJBClient {
    
    @EJB
    TimeKeeper timeKeeper;
    
    public String getDateTime(){
        return timeKeeper.dateTime();
    }
}
