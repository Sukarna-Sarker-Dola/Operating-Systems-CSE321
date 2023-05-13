public class task1 {
    public static void main (String[]args) {
        Runnable obj1=new one();
        Thread t1=new Thread(obj1);
        t1.start();
    }
}
class one implements Runnable {
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println("Thread 1 : "+i);
        }
        Runnable obj2=new two();
        Thread t2=new Thread(obj2);
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=21;i<=30;i++) {
            System.out.println("Thread 1 : "+i);
        }
    }
}
class two implements Runnable{
    public void run() {
        for (int i=11;i<=20;i++) {
            System.out.println("Thread 2 : "+i);
        }
    }
}