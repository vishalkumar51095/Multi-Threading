import java.net.*;
import java.io.*;
import java.util.Scanner;
public class GameServer
{
public static void main(String[] args) throws IOException
{
int portno=1000;
Scanner sc = new Scanner(System.in);
int num=4;//sc.nextInt();
System.out.println("hihiiii");
System.out.println("Connecting");
ServerSocket ss=new ServerSocket(portno);
Socket s=ss.accept();
        PrintWriter writer=new PrintWriter(s.getOutputStream());  
        Scanner scanner=new Scanner(System.in);
        String message="";
        while(!(message.equals("0")))
        {
            System.out.println("Enter Message");
            message=scanner.nextLine();
        writer.println(message );
        writer.println();
        writer.flush();
        }
}
}