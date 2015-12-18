package ejbap.concurrency;

import javax.ejb.AccessTimeout;
import javax.ejb.Stateful;

@Stateful
public class StatefulBeanWithTimeout{
    
    @AccessTimeout(value=5000, unit=java.util.concurrent.TimeUnit.MILLISECONDS)
    public void find(String id){
        //... business logic
    }
}