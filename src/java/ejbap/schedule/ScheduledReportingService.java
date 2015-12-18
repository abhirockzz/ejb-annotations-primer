package ejbap.schedule;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;

@Stateless
public class ScheduledReportingService {
    
    @Schedule
    public void generateAuditReport(){
        System.out.println("Generating audit report....");
    }
    
    /**
     * A Timer instance is injected 
     * automatically by the container
     */
    @Schedule
    public void generateSalesReport(Timer timer){
        System.out.println("Generating Sales report....");
        System.out.println("Next execution on - "+ timer.getNextTimeout());
        
    }
}
