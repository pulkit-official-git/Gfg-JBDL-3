package ProducerConsumerUsingSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{
    Store store;
    Semaphore ps;
    Semaphore cs;

    public Producer(Store store, Semaphore ps, Semaphore cs) {
        this.store = store;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {

        while(true){
            try {
                ps.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.items.size() < store.getMaxSize()){
                    store.addItem();
                }
            cs.release();

        }

    }
}
