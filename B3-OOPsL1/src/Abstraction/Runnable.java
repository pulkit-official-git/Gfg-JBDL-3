package Abstraction;

public interface Runnable extends Animal{

    public default void run() {
        System.out.println("not flying but ruuning");
    }
}
