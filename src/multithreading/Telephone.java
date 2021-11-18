/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author vishal kumar
 */
public class Telephone extends Thread {
    String number;

    public Telephone(String number) {
        this.number = number;
    }
    public static void call()
    {
        try{
        for(int i =0; i<=10; i++)
        {
            System.out.println(i);
        }
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
    

    @Override
    public void run() {
        call(); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        Telephone t1= new Telephone("100");
        
        
    }
    
    
    
}
