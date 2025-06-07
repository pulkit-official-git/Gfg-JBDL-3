package Batch3Generics;

import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Pair p = new Pair();    // it is raw data types i.e. Object
//        p.first="apple";
//        p.second=100;
//        p.first = List.of(1,23);
//        p.doSomething("ram");

        Pair<String,Long> p2 = new Pair<String,Long>();
        p2.first="ram";
        p2.second=2L;
        p2.doSomething("sham");

        p2.<String>doingSomething("apple");  // optional
        p2.doingSomething(100000);

        p2.doSomething("apple");
        p2.doSomething(98.3);

        Pair.done(100);
        Pair.done("Apple");


    }
}
