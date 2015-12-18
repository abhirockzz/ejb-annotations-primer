package ejbap.core;

import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

@Stateful
public class StatefulBeanExample {
    
    private String changeID;
    
    @PostConstruct //will be explained later
    public void init(){
        changeID = UUID.randomUUID().toString(); 
    }
    
    public String getChangeID(){
        //the client gets the same value on subsequent invocations
        return changeID;
    }
    
    public void updateProperty(String key, Object value){
        //business logic
        System.out.println("Changes made under ID: "+ changeID);
    }
}
