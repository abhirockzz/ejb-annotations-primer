package ejbap.security;

import java.math.BigDecimal;
import javax.annotation.Resource;
import javax.annotation.security.DeclareRoles;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;

@DeclareRoles({"admin"})
@Stateless
public class AdminOperationsFacade {
    @Resource
    private EJBContext ejbCtx;
    
    public void updateSalary(BigDecimal salary){
        System.out.println("Is Admin ? "+ ejbCtx.isCallerInRole("admin"));
        //business logic...
    }
}
