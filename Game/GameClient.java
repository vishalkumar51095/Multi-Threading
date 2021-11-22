import java.net.*;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class GameClient
{
    public static void main(String[] args) throws IOException {
        int portno=1000;
        Socket s=new Socket("localhost", portno);
    BufferedReader br=new BufferedReader(new InputStreamReader( s.getInputStream()));
    while(true)
    {
        String str=br.readLine();
        if((str.equals("0")))
           break; 
        System.out.println(str);
    
    }
    }
}