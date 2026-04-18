class Bank{
    int bal=1000;
    synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " is withdrawing....");
        if(bal>=amount){
            bal=bal-amount;
            System.out.println("Remaining:"+bal);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

}
public class ConcurrencyImp {
    public static void main(String[] args) {
        Bank b=new Bank();
        Runnable task=()->{
            b.withdraw(400);
        };
        Thread t1=new Thread(task,"User 1");
        Thread t2=new Thread(task,"User 2");
        t1.start();
        t2.start();
    }
}
