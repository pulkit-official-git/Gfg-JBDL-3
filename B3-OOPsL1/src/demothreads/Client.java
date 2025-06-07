package demothreads;

public class Client {

    public static void doSomething() {
        System.out.println("Inside DoSomething :"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        System.out.println("In main:"+Thread.currentThread().getName());
        doSomething();
        PrintHello hello = new PrintHello();
        Thread t1 = new Thread(hello,"My thread");
        t1.start();


        for(int i=1;i<=100;i++){
            PrintNumbers p = new PrintNumbers(i);
            Thread t2 = new Thread(p,"Thread "+i);
            t2.start();
        }
    }
}
