/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonepackage;

/**
 *
 * @author vishal kumar
 */

public class Telephone {
    String number;

    public Telephone(String number) {
        this.number = number;
    }
    public  void call(Telephone telephone)
            //if we synchornized call method, then only one call will happen in particular time
            //but if we make a block synchronized ,then more one call can happen
    {
        System.out.println(this + " is calling " + telephone);
        synchronized(this) //for synchronizing whole block
       {
           synchronized(telephone)
           {
        try{
        for(int i =0; i<=10; i++)
        {
            System.out.println(this + " is talking " + telephone + "   " + i);
            Thread.sleep(500); 
        }
        System.out.println(this + " call over " + telephone);
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
           }
    }
    }
        
    @Override
    public String toString() {
        return "Telephone{" + "number=" + number + '}';
    }
    
   
    
    
    
}
