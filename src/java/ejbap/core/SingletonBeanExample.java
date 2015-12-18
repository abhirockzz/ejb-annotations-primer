package ejbap.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

@Singleton
public class SingletonBeanExample {
    private Properties config;
    
    @PostConstruct //will be explained later
    public void init(){
        config = new Properties();
        try {
            //cached (singleton)
            config.load(new FileInputStream("appconfig.xml"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public String getPropertyValue(String key){
        return config.getProperty(key);
    }
}
