class Timer implements Runnable{
        public void run(){
            for(int i=1;i<=5;i++){
                try {
                    System.out.println(Thread.currentThread().getName() + " Timer 1: " + i);
                    Thread.sleep(50);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
public class RunnableImp {
       public static void main(String[] args) {
        Timer1 t1=new Timer1();
        Timer2 t2=new Timer2();
        t1.start();
        t2.start();;


    }
}
