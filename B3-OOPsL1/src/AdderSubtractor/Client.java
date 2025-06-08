package AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();
//        Lock lock2 = new ReentrantLock();
        ExecutorService ex = Executors.newCachedThreadPool();
        Adder adder = new Adder(count,lock);
        Subtractor subtractor = new Subtractor(count,lock);
        Future<Integer> f1 = ex.submit(adder);
        Future<Integer> f2 = ex.submit(subtractor);
        f1.get();
        f2.get();
        System.out.println(count.value);
    }
}
