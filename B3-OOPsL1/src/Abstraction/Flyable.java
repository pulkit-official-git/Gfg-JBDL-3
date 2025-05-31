package Abstraction;

public interface Flyable extends Animal {
    public void fly();

    public default void run() {
        System.out.println("not running but flying");
    }
}
