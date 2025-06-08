package demoProducerConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    Semaphore ps;
    Semaphore cs;

    public Consumer(Store store,Semaphore ps,Semaphore cs) {
        this.store = store;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {
        while(true){
//            synchronized (store) {
            try {
                cs.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(store.items.size()>0){
                    store.removeItem();
//                }
            }
            ps.release();

        }

    }
}
