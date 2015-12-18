package ejbap.schedule;

import javax.ejb.Schedule;
import javax.ejb.Schedules;
import javax.ejb.Stateless;

@Stateless
public class MultipleSchedules {
    
    @Schedules({
        //1 AM on Monday
        @Schedule(hour="1", dayOfWeek="Mon"),
        //2:30 AM on Friday
        @Schedule(hour="2", minute = "30", dayOfWeek="Fri")
    })
    public void generateAuditReport(){
        System.out.println("Generating audit report....");
    }
  
}
