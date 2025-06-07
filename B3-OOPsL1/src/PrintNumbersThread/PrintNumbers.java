package PrintNumbersThread;

public class PrintNumbers implements Runnable {

    int noToPrint;
    public PrintNumbers(int noToPrint) {
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println("Number of prints : " + noToPrint + " inside thread :"+ Thread.currentThread().getName());
    }
}
