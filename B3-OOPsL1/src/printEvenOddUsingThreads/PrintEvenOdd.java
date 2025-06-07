package printEvenOddUsingThreads;

public class PrintEvenOdd implements Runnable {
    int noToPrint;
    public PrintEvenOdd(int noToPrint) {
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println("noToPrint = " + noToPrint + " inside thread" + Thread.currentThread().getName());
    }
}
