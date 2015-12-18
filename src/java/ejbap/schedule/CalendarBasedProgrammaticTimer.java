package ejbap.schedule;

import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

@Stateless
public class CalendarBasedProgrammaticTimer {

    @Resource
    private TimerService ejbTimerService;

    public void trigger() {
        ScheduleExpression schedule = new ScheduleExpression();
        schedule.dayOfMonth("1");//fist day of every month
        
        Timer timer = ejbTimerService.createCalendarTimer(schedule);
        System.out.println("Calendar based programmatic timer " 
                + timer.toString() + " created");
    }

    @Timeout
    public void onTimeout(Timer timer) {
        System.out.println("Timer schedule: " + timer.getSchedule());

    }
}
