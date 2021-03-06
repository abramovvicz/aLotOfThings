import java.util.Timer;
import java.util.TimerTask;
 
public class Task2 {
 
  public static void main(String[] args) {
    TimerTask task = new TimerTask() {
      @Override
      public void run() {
        // task to run goes here
        System.out.println("Hello !!!");
      }
    };
     
    Timer timer = new Timer();
    long delay = 20000;
    long intervalPeriod = 1 * 1000; 
     
    // schedules the task to be run in an interval 
    timer.scheduleAtFixedRate(task, delay,
                                intervalPeriod);
   
  } // end of main
}