 package ejbap.core;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
    //below mentioned annotation will be covered later
    @ActivationConfigProperty(propertyName = "destinationLookup",
            propertyValue = "java:comp/env/myQueue"),
    @ActivationConfigProperty(propertyName = "destinationType",
            propertyValue = "javax.jms.Queue")
})
public class MDBExampleBean implements MessageListener{

    @Override
    public void onMessage(Message msg) {
        try {
            print(msg);
        } catch (JMSException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private void print(Message msg) throws JMSException{
        System.out.println("Message ID "+ msg.getJMSMessageID());
        System.out.println("Message type "+ msg.getJMSType());
    }
    
}
