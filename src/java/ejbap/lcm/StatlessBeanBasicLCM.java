package ejbap.lcm;

import ejbap.core.StatelessBeanExample;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class StatlessBeanBasicLCM {
    
    @Inject
    private StatelessBeanExample instance;
    
    @PostConstruct
    public void init(){
        System.out.println("Post construct callback invoked");
        System.out.println("Injected EJB instance - " + instance.hashCode());
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("I am about to be consumed by the GC !");
    }
}
