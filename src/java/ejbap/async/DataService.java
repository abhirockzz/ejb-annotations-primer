package ejbap.async;

import java.util.UUID;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

@Stateless
public class DataService {

    @Asynchronous
    public Future<String> fetch() {
        System.out.println("Invocation thread -- " + Thread.currentThread().getName());
        return new AsyncResult<>(longRunningMethod());
    }

    private String longRunningMethod() {
        System.out.println("Async execution thread -- " 
                + Thread.currentThread().getName());

        try {
            //for sample purposes ONLY
            Thread.sleep(5000);

        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        return UUID.randomUUID().toString();
    }
}
