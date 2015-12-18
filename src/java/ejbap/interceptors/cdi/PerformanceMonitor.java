package ejbap.interceptors.cdi;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@PerformanceMonitorInterceptorBinding
public class PerformanceMonitor {
    
   @AroundInvoke 
   public Object measure(InvocationContext ic) throws Exception{
       long start = System.currentTimeMillis();
       Object result = null;
       final String className = ic.getTarget().getClass().getSimpleName();
       final String methodName = ic.getMethod().getName();
       try {
           result = ic.proceed();
       } catch (Exception ex) {
           System.err.println(ex.getMessage());
       }finally{
           long elapsed = System.currentTimeMillis() - start;
           System.out.println(String.format("Time spent in %s#%s - %s", className, 
                   methodName, elapsed));
       }
       return result;
   }
}
