package multithreading;
public class SynchronizedExample extends Thread{
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=5;i++)
        {
        SynchronizedExample example1=new SynchronizedExample("" + i);
            System.out.println("Thread " + i + " is trying to enter ");
        example1.start();
        
        }
    }
    
    
    String name;

    public SynchronizedExample(String name) {
        this.name = name;
    }
    
    @Override
    public void run()
    {
        counter(name);
    }
    public static synchronized void counter(String threadname)
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(threadname + " : " + i);
                Thread.sleep(1000);
            }
            System.out.println("Thread " + threadname + " is removed ");
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
    
}
