package ejbap.views.nointerface;

import ejbap.views.nointerface.interfaces.WorkflowManagementInterface;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class WorkflowMangementSessionFacade implements WorkflowManagementInterface {

    @Override
    public void trigger() {
        //logic...
    }

    @Override
    public String getCurrentAssigne(String workflowID) {
        return "42";
    }

    @Override
    public boolean isComplete(String workflowID) {
        return true;
    }

    @Override
    public int getStatus(String workflowID) {
        return 42;
    }

}
