package ejbap.views.local.interfaces;

import javax.ejb.Local;

@Local
public interface TimerServiceInterface {
    public String getTime();
}
