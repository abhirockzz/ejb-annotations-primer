package ejbap.common;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;

@Singleton
@Startup
/**
 * Below mentioned annotation is specific to JMS and has not been covered. It
 * helps in auto registration of JMS destinations during application deployment
 *
 * More info here: http://bit.ly/autojms
 */
@JMSDestinationDefinitions(
    {
        @JMSDestinationDefinition(interfaceName = "javax.jms.Queue", name = "java:comp/env/myQueue"),
        @JMSDestinationDefinition(interfaceName = "javax.jms.Queue", name = "java:comp/env/orderQueue")
    }
)
public class DestinationAutoProvisionService {

    @PostConstruct
    public void confirm() {
        System.out.println("Queues configured");
    }
}
