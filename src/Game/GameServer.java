package Game;

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class GameServer
{
    //*************************************************************************
 
    
    //*************************************************************************
public static void main(String[] args) throws IOException
{
int portno=1000;
Scanner sc = new Scanner(System.in);
int num=4;//sc.nextInt();
System.out.println("hihiiii");
System.out.println("Connecting");
ServerSocket ss=new ServerSocket(portno);

    
Socket s=ss.accept();
        PrintWriter writer1=new PrintWriter(s.getOutputStream());  
        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        s=ss.accept();
        System.out.println("Connected");
        PrintWriter writer2=new PrintWriter(s.getOutputStream());  
        BufferedReader br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
        EchoThread et1=new EchoThread(writer1,writer2,br1);
       EchoThread et2=new EchoThread(writer1,writer2,br2);
       et1.start();
       et2.start();
}
}



   class EchoThread extends Thread
    {
        PrintWriter writer1,writer2;
        BufferedReader br;

    public EchoThread(PrintWriter writer1, PrintWriter writer2, BufferedReader br) {
        this.writer1 = writer1;
        this.writer2 = writer2;
        this.br = br;
    }
        
      @Override
      public void run()
      {
          try
          {
          while(true)
          {
              String str=br.readLine();
              writer1.println(str);
              writer2.println(str);
              writer1.flush();
              writer2.flush();         
          }
          }
          catch(Exception ex)
          {
              System.out.println(ex);
          }
      }
        
        
        
    }
    
