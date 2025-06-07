package Batch3Threads;

public class PrintHello implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside PrintHello : " + Thread.currentThread().getName() );
        System.out.println("Hello World!");
    }
}
