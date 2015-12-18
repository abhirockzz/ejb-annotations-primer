package ejbap.eagerinit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
@DependsOn("AppConfigInitBean")
public class DependentSingleton {
    
    @Inject
    private AppConfigInitBean appConfig;
    
    @PostConstruct
    public void init() {
        System.out.println("Singleton is ready for use");
        System.out.println("Configuration: "+appConfig.getConfig());
    }

    @PreDestroy
    public void destroy() {
        //Presence of 'AppConfigInitBean' instance is confirmed
        System.out.println("Time to disappear!");
    }
}
