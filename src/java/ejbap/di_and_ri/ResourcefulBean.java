package ejbap.di_and_ri;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;

@Singleton
@Startup
public class ResourcefulBean {
    
    @Resource
    ConnectionFactory jmsCF;
    @Resource
    Destination jmsDestination;       
    @Resource
    TimerService ejbTs;    
    
    @PostConstruct
    public void setUp(){
        ejbTs.createSingleActionTimer(10000, new TimerConfig());
    }        
    
    @Timeout
    public void onTimeout(){
        jmsCF.createContext().createProducer().send(jmsDestination, "a new message triggered by timer");
    }
}
