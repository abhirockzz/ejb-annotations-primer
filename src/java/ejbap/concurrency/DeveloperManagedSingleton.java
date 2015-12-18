package ejbap.concurrency;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;

@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class DeveloperManagedSingleton {
    
    private String property;
    
    /**
     * need to synchronize this manually since container 
     * has no control over how many threads can enter this method
     */
  
    public synchronized void update(String property){
        this.property = this.property + " "+ property;
    }
    
    
    @PostConstruct
    public void init() {
        property = new Date().toString();
    }
}
