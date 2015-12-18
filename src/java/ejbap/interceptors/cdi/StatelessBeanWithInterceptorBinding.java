package ejbap.interceptors.cdi;

import javax.ejb.Stateless;

@Stateless
public class StatelessBeanWithInterceptorBinding {
    
    @PerformanceMonitorInterceptorBinding
    public void timeTakingOp(){
        try {
            //not allowed inside EJB container... just for simulation
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            //ignore...
        }
    }
}
