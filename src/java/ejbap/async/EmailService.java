package ejbap.async;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
@Asynchronous
public class EmailService {

    public void sendMail() {

        System.out.println("Sending email......");
        try {
            //for sample purposes ONLY
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

}
