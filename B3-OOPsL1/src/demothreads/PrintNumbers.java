package demothreads;

public class PrintNumbers implements Runnable {
    int noToPrint;
    public PrintNumbers(int noToPrint) {
        this.noToPrint = noToPrint;
    }
    @Override
    public void run() {
        System.out.println("Printing numbers: " + noToPrint+ "in thread " + Thread.currentThread().getName());

    }
}
