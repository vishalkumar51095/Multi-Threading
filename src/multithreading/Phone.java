/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author maury
 */
public class Phone extends Thread {
        String number;

    public Phone(String number) {
        this.number = number;
    }
    public synchronized void call (String number)
    {
        
    }
        
    
}
