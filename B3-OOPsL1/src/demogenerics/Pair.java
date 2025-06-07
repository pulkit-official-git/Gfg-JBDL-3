package demogenerics;

public class Pair <A,B> {           // class level generics
    A first;
    B second;

    public static <A> void done(A a){
        System.out.println("done"+a);
    }


    public <B> void doSomething(B b){
        System.out.println(b);
    }

    public <C>void doingSomething(C c){
        System.out.println(c);
    }

    public void setFirst(A val) {
        first = val;
    }

    public B getSecond() {
        return second;
    }

}
