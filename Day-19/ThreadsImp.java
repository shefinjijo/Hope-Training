class Timer1 extends Thread{
        public void run(){
            for(int i=1;i<=5;i++){
                try {
                    System.out.println("Timer 1: " + i);
                    Thread.sleep(50);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
    class Timer2 extends Thread{
        public void run(){
            int j;
            for(int i=1;i<=5;i++){
                try {
                    System.out.println("Timer 2: " + i);
                    Thread.sleep(50);
                } catch (Exception e) {
                    System.out.println(e);
                }
                j=i;
            }
        }
    }
public class ThreadsImp {
    public static void main(String[] args) {
        Timer1 t1 = new Timer1();
        Timer2 t2 = new Timer2();
        t1.start();
        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
