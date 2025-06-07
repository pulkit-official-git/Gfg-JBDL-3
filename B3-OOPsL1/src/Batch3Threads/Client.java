package Batch3Threads;

public class Client {

    public static void doSomething(){
        System.out.println("Inside doSomething: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        PrintHello hello = new PrintHello();
        Thread thread = new Thread(hello,"lifes first thread");
        thread.start();
        doSomething();
    }
}
