
package ejbap.di_and_ri;

import java.util.Date;
import javax.ejb.Stateless;

@Stateless
public class TimeKeeper {
    
    public String dateTime(){
        return new Date().toString();
    }
}
