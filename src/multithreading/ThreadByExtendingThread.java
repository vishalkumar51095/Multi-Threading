package multithreading;
public class ThreadByExtendingThread extends Thread
/*The Thread class implements Runnable Interface. SO, its the same thing.
        It has one method. The public void run method which contains the task to be done by the
        thread.
*/
{
int interval;
String name;
    public ThreadByExtendingThread(int interval,String name) {
        this.interval = interval;
        this.name= name;
    }

    @Override
    public void run() {
       for(int i=1;i<=10;i++)
       {
           System.out.println(i+"   "+name);
           try
           {
           Thread.sleep(interval);//Sleep for 1 second
           }
           catch(Exception ex)
           {
               System.err.println(ex);
           }
       }
    }
    
    public static void main(String[] args) throws InterruptedException {
  ThreadByExtendingThread th1=new ThreadByExtendingThread(1,"One");
  ThreadByExtendingThread th2=new ThreadByExtendingThread(1,"two");
  ThreadByExtendingThread th3=new ThreadByExtendingThread(1,"three");
  ThreadByExtendingThread th4=new ThreadByExtendingThread(1,"four");
        //Run as a thread
        th1.start();
        th2.start();
        //th1.join();
        th2.join();
        th3.start();
        th4.start();
        //th3.join();
        //th1.join();
        for(int i=1;i<=10;i++)
       {
           System.out.println(" yes"+i);
           try
           {
           Thread.sleep(1);//Sleep for 1 second
           }
           catch(Exception ex)
           {
               System.err.println(ex);
           }
           //System.out.println();
       }
        //System.out.println("Do after threads are done");
        //th3.join();
        //th4.start();
        
    }
    
}
