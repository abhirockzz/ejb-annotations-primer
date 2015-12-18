package ejbap.eagerinit;

import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class AppConfigInitBean {

    private String configuration;

    @PostConstruct
    public void init() {
        configuration = UUID.randomUUID().toString();
        System.out.println("Configuration bootstrapped -- " + configuration);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying configuration -- " + configuration);
        configuration = null;
    }

    public String getConfig() {
        return configuration;
    }
}
