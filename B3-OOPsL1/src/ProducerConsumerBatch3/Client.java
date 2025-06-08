package ProducerConsumerBatch3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        ExecutorService ex = Executors.newCachedThreadPool();
        for (int i = 0; i < 8; i++) {
            ex.submit(new Producer(store));
        }

        for (int i = 0; i < 20; i++) {
            ex.submit(new Consumer(store));
        }

    }
}
