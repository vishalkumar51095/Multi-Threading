import java.net.*;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class GameClient
{
    public static void main(String[] args) throws IOException {
        int portno=1000;
        Socket s=new Socket("localhost", portno);
        PrintWriter pw=new PrintWriter(s.getOutputStream());
    BufferedReader br=new BufferedReader(new InputStreamReader( s.getInputStream()));
    ReadThread rt=new ReadThread(br);
    rt.start();
    Scanner s1=new Scanner(System.in);
    while(true)
    {
        String str=s1.nextLine();
        pw.println(str);
        pw.flush();
    
    }
    }
}
class ReadThread extends Thread
{

    public ReadThread(BufferedReader br) {
        this.br = br;
    }
    BufferedReader br;
    public void run()
    {
        try
        {
            while(true)
            {
                String str=br.readLine();
                System.out.println(str);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}