
package phonepackage;

public class Caller extends Thread{
    Telephone t1,t2;

    public Caller(Telephone t1, Telephone t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    
    @Override
    public void run()
    {
        t1.call(t2);
    }
    
    public static void main(String[] args) {
        Telephone t1=new Telephone("100");
        Telephone t2=new Telephone("101");
        Telephone t3=new Telephone("102");
        Telephone t4=new Telephone("104");
        Caller c1=new Caller(t1, t2);
        Caller c2=new Caller(t1, t3);
        Caller c3=new Caller(t2, t3);
        Caller c4=new Caller(t3,t4);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
