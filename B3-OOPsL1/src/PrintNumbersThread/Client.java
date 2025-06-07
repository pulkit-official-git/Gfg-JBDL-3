package PrintNumbersThread;

public class Client {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i==50){
                System.out.println(i);
            }
            PrintNumbers printNumbers = new PrintNumbers(i);
//            printNumbers.run();
            Thread thread = new Thread(printNumbers , "Thread "+i);
            thread.start();
        }
    }
}
