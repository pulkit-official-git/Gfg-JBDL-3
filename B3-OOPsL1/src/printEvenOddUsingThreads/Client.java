package printEvenOddUsingThreads;

public class Client {

    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            if(i%2==0){
                PrintEvenOdd printEvenOdd = new PrintEvenOdd(i);
                Thread thread = new Thread(printEvenOdd,"EvenThread");
                thread.start();
            }
            else{
                PrintEvenOdd printEvenOdd = new PrintEvenOdd(i);
                Thread thread = new Thread(printEvenOdd,"OddThread");
                thread.start();
            }
        }

    }
}
