package ejbap.di_and_ri;

import javax.ejb.EJB;

public class AnotherTimeKeeperClient {
    
    @EJB(lookup = "java:global/ejbap/TimeKeeper")
    TimeKeeper timeKeeper;
    
    public String getDateTime(){
        return timeKeeper.dateTime();
    }
}
