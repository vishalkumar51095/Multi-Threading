/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.Scanner;

/**
 *
 * @author vishal kumar
 */
public class ThreadLifeCycle extends Thread{
    
    
    


int interval;
String name;
    public ThreadLifeCycle(int interval) {
        this.interval = interval;
        this.name= name;
    }

    @Override
    public void run() {
       for(int i=1;;i++)
       {
           System.out.println(i);
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
  ThreadLifeCycle th=new ThreadLifeCycle(1000);
 
        //Run as a thread
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("1-Start,2-Suspend, 3-Resume, 4-Stop");
            int option=scanner.nextInt();
            switch(option)
            {
                case 1:th.start();
                break;
                case 2:th.suspend();
                break;
                case 3:th.resume();
                break;
                case 4:th.stop();
                break;
            }
       }
        }
    
}
