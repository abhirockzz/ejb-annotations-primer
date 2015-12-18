package ejbap.ws;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Stateless
@Path("test")
public class EJBonREST {

    @GET
    public String get(@QueryParam("name") String propName){
        return System.getProperty(propName);
    }
    
    @POST
    public String greet(final String greeting){
        return greeting + " World !";
    }
    
}
