package executorsAndThreadPool;

import Batch3Threads.PrintHello;
import printEvenOddUsingThreads.PrintEvenOdd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {


        ExecutorService ex1 = Executors.newCachedThreadPool();
        ExecutorService ex2 = Executors.newFixedThreadPool(16);
        ex1.submit(new PrintNumbers());
    }
}
