package Abstraction;

public interface showdown extends Runnable, Flyable {
    @Override
    void fly();

    @Override
    default void run() {
        Flyable.super.run();
    }

    @Override
    void eat();

    @Override
    void sleep();
}
