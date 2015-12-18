package ejbap.schedule;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class SchedulerConfigurationExamples {
    
    //Jan 1 (year on year)
    @Schedule(second="0", minute="0", hour="0", 
    dayOfMonth="1", month="Jan", dayOfWeek="*", 
    year="*")
    public void sendNewYearGreetings(){
        //logic
    }
    
    //every 10 minutes
    @Schedule(minute="*/10", hour="*")
    public void dbHealthCheck(){
        //logic
    }
    
    //every friday (midnight)
    @Schedule(dayOfWeek="Fri")
    public void timesheetReport(){
        //logic
    }
}
