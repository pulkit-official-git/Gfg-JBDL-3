package executorsAndThreadPool;

public class PrintNumbers implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<=10000000;i++){
            if(i==80){
                System.out.println(i);
            }
            System.out.println(i);
        }
    }
}
