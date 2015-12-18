package ejbap.schedule;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerConfig;
import javax.ejb.TimerService;

@Stateless
public class SimpleProgrammaticTimer {
    
    @Resource
    private TimerService ejbTimerSvc;
    
    public void trigger(Event event){
       TimerConfig configuration = new TimerConfig(event.detail, true);
       Timer timer = ejbTimerSvc.createSingleActionTimer(10000, configuration);
       System.out.println("Single action timer " + timer.toString() +" created");
    }

    @Timeout
    public void onTimeout(Timer timer){
        System.out.println("Event details: "+ timer.getInfo());
             
    }
    
    private static class Event {  
        private String detail;

        public Event(String detail) {
            this.detail = detail;
        }
    }
}
