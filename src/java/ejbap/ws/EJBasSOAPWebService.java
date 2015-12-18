package ejbap.ws;

import java.util.Date;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@Stateless
@WebService
public class EJBasSOAPWebService {
    
    @WebMethod
    public String getDate(){
        return new Date().toString();
    }
    
    @WebMethod
    @WebResult(name = "response")
    public String greet(@WebParam String greeting){
        return greeting + " World !";
    }
}
