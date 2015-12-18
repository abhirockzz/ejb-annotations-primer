package ejbap.concurrency;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;

@Singleton
//applicable by default
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class ContainerManagedSingleton {
    
    private String property;
    
    //container takes care of synchronization. WRITE protected by default
    public void update(String property){
        this.property = this.property + " " + property;
    }

    @PostConstruct
    public void init() {
        property = new Date().toString();
    }
    

}
