package ProducerConsumerBatch3;

import java.util.ArrayList;
import java.util.List;

public class Store {
    Integer maxSize;
    List<Object> items;

    public Store(Integer maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<Object>();
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void addItem() {
        this.items.add(new Object());
        System.out.println("Producer produced: " + this.items.size() + " items");
    }

    public void consumeItem() {
        this.items.remove(items.size() - 1);
        System.out.println("Consumer consumed: " + this.items.size() + " items");
    }
}
