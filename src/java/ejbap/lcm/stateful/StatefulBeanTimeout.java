package ejbap.lcm.stateful;

import java.util.concurrent.TimeUnit;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import java.util.Date;

@Stateful
@StatefulTimeout(value = 1, unit = TimeUnit.MINUTES)
public class StatefulBeanTimeout {
    
    public String getTime(){
        return new Date().toString();
    }
}
