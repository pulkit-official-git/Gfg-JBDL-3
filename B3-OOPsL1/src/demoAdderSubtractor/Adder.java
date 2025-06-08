package demoAdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Integer> {
    private Count count;
//    private Lock lock;
    public Adder(Count count) {
        this.count = count;
//        this.lock = lock;
    }

    @Override
    public Integer call() throws Exception {
        for(int i = 1; i <= 100; i++) {
//            lock.lock();
//            synchronized (count){
//                count.value+=i;
//            }
//            count.value+=i;
//            lock.unlock();
            count.incrementByX(i);
        }
        return count.value;
    }
}
