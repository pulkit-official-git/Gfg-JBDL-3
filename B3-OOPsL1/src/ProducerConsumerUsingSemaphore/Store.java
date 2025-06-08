package ProducerConsumerUsingSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    Integer maxSize;
    ConcurrentLinkedDeque<Object> items;

    public Store(Integer maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<Object>();
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void addItem() {
        this.items.add(new Object());
        System.out.println("Producer produced: " + this.items.size() + " items");
    }

    public void consumeItem() {
        this.items.remove();
        System.out.println("Consumer consumed: " + this.items.size() + " items");
    }
}
