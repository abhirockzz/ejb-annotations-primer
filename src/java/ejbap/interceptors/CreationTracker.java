package ejbap.interceptors;

import javax.interceptor.AroundConstruct;
import javax.interceptor.InvocationContext;

public class CreationTracker {
    
    @AroundConstruct
    public void logObjectCreation(InvocationContext ic){
        final String className = ic.getTarget().getClass().getName();
        System.out.println("Created an instance of class "+ className);
    }
}
