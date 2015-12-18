package ejbap.async;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup",
            propertyValue = "java:comp/env/orderQueue"),
    @ActivationConfigProperty(propertyName = "destinationType",
            propertyValue = "javax.jms.Queue")
})
public class MDBWithActivationConfig implements MessageListener{

    @Override
    public void onMessage(Message msg) {
        try {
            emailOrderDetails(msg);
        } catch (JMSException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private void emailOrderDetails(Message msg) throws JMSException{
        //logic to send order details...
    }
    
}
