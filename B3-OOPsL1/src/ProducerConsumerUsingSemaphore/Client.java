package ProducerConsumerUsingSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Semaphore ps = new Semaphore(5);
        Semaphore cs = new Semaphore(0);
        ExecutorService ex = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) {
            ex.submit(new Producer(store,ps,cs));
        }

        for (int i = 0; i < 20; i++) {
            ex.submit(new Consumer(store,ps,cs));
        }

    }
}
