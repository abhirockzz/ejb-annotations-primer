package ejbap.views.nointerface.interfaces;

public interface WorkflowManagementInterface {
    public void trigger();
    public String getCurrentAssigne(String workflowID);
    public boolean isComplete(String workflowID);
    public int getStatus(String workflowID);
}
