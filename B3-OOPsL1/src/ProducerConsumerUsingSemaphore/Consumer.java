package ProducerConsumerUsingSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Store store;
    Semaphore ps;
    Semaphore cs;

    public Consumer(Store store, Semaphore ps, Semaphore cs) {
        this.store = store;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {
        while (true) {
            try {
                cs.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.items.size()>0){
                    store.consumeItem();
                }
            ps.release();
        }

    }
}
