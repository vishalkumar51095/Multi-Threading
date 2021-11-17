package multithreading;
public class ThreadImplementingRunnable implements Runnable 
/*All Threads will implement the Runnable Interface.
        java.lang.Runnable.
  It has one method. The public void run method which contains the task to be done by the
        thread.
*/
{

    @Override
    public void run() {
       for(int i=1;i<=10;i++)
       {
           System.out.println(i);
           try
           {
           Thread.sleep(1000);//Sleep for 1 second
           }
           catch(Exception ex)
           {
               System.err.println(ex);
           }
       }
    }
    public static void main(String[] args) {
        ThreadImplementingRunnable r1=new ThreadImplementingRunnable();
        ThreadImplementingRunnable r2=new ThreadImplementingRunnable();
        Thread th1=new Thread(r1);
        Thread th2=new Thread(r2);
        /*
        Run normally
        th1.run();
        th2.run();
*/
        //Run as a thread
        th1.start();
        th2.start();
        
    }
    
}
