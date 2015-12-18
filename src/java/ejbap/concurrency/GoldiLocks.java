package ejbap.concurrency;

import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
public class GoldiLocks {

    private String configuration;

    @PostConstruct
    public void init() {
        configuration = UUID.randomUUID().toString();
        System.out.println("Configuration bootstrapped -- " + configuration);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Configuration -- " + configuration);
        configuration = null;
    }

    /**
     * This is by default. We can afford to relax
     * since this is a READ operation
     */
    @Lock(LockType.READ) 
    public String getConfig() {
        return configuration;
    }

    /**
     * We don't want multiple threads updating the configuration 
     * (a WRITE operation) at the same time!
     */
    @Lock(LockType.WRITE) 
    public void update(String config) {
        this.configuration = configuration + " " + config;
    }
}
