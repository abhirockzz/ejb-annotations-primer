
package ejbap.views.local;

import ejbap.views.local.interfaces.TimerServiceInterface;
import java.util.Date;
import javax.ejb.Stateless;

@Stateless
public class TimerServiceBean implements TimerServiceInterface {

    @Override
    public String getTime() {
        return new Date().toString();
     }
    
}
