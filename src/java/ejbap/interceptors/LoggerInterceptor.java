package ejbap.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggerInterceptor {
   
   @AroundInvoke 
   public Object log(InvocationContext ic) throws Exception{
       Object result = null;
       final String className = ic.getTarget().getClass().getSimpleName();
       final String methodName = ic.getMethod().getName();
       try {
           System.out.println(String.format(">> %s#%s", className, methodName));
           result = ic.proceed();
       } catch (Exception ex) {
           System.err.println(ex.getMessage());
       }finally{
           System.out.println(String.format("<< %s#%s", className, methodName));
       }
       return result;
   } 
}
