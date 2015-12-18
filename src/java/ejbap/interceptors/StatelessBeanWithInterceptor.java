package ejbap.interceptors;

import java.util.Date;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

@Stateless
@Interceptors({LoggerInterceptor.class, CreationTracker.class})
public class StatelessBeanWithInterceptor {
    
    public String getTime(){
        return new Date().toString();
    }
    
    
}
