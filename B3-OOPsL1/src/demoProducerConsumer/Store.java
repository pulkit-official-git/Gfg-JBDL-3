package demoProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {

    private Integer maxSize;
    ConcurrentLinkedDeque<Object> items;

    public Store(Integer maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize(){
        return this.maxSize;
    }

    public void addItem(){
        System.out.println("Producer producing " + this.items.size() + " items" );
        this.items.add(new Object());
    }

    public void removeItem(){
        System.out.println("Consumer consuming " + this.items.size() + " items" );
        this.items.remove();
    }
}
