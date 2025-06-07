package Batch3Generics;

public class Pair <V,S> {                         // class level generics
    V first;
    S second;

    public static <T> void done(T t){
        System.out.println(t);
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public <V> void doSomething(V v){
        System.out.println(v);
    }

    public<T> void doingSomething(T t){  // method level generics
        System.out.println(t);
    }

    public S getSecond() {
        return second;
    }
}
