package AdderSubtractor;

public class Count {
    Integer value=0;

    public synchronized void IncrementByX(Integer x) {
        value+=x;
    }

    public synchronized void DecrementByX(Integer x) {
        value-=x;
    }
}
