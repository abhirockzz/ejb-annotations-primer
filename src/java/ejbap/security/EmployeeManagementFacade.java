package ejbap.security;

import java.math.BigDecimal;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

@Stateless
@DeclareRoles({"Administrators", "HR , Managers"})
@RolesAllowed({"Managers"})
public class EmployeeManagementFacade {
    
    @RolesAllowed({"HR"})
    public void updateSalary(BigDecimal salary){
        //only 'HR'
    }
    
    public void updateAppraisalDetails(String details){
        //only 'Managers'
    }
    
    @PermitAll
    public String getEmailAddress(String empID){
        //no authorization needed
        String address = null;
        //logic..
        return address;
    }
    
    @DenyAll
    public void deleteEmployeeRecord(int id){
        //external access blocked
    }
}
