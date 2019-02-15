public class Task1 {
 
public static void main(String[] args) {
  // run in a second
  final long timeInterval = 1000;
  Runnable runnable = new Runnable() {
   
  public void run() {
      int i = 0;
      Boolean flag = true;

    while (flag) {
      // ------- code for task to run
      System.out.println("Hello !!");
      // ------- ends here
      i++;
      if(i==10){
flag = false;
      }
      try {
       Thread.sleep(timeInterval);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      }
    }
  };
   
  Thread thread = new Thread(runnable);
  thread.start();
  }
}