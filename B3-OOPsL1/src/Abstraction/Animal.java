package Abstraction;

public interface Animal {

    public void eat();

    public void sleep();

    public default void run() {
        System.out.println("running");
    }
}
