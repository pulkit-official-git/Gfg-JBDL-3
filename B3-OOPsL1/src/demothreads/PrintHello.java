package demothreads;

public class PrintHello implements Runnable {

    @Override
    public void run() {
        System.out.println("In run method:"+Thread.currentThread().getName());
        System.out.println("Hello World");
    }
}
