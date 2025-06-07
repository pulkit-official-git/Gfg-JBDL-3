package demogenerics;

import java.util.HashMap;
import java.util.List;

public class Client {

    public static void main(String[] args) {
//        Pair p = new Pair();
//        p.first = "ram";
//        p.second= "sham";
//        p.first = List.of(1,2);

        Pair<String,Integer> p1 = new Pair<>();
        p1.setFirst("first");
        p1.second=100;
        System.out.println(p1.getSecond());

//        HashMap h = new HashMap();
//        h.put("first","value");
//        h.put("second",100);

        p1.doSomething("car");
        p1.doingSomething("ram");
        p1.doingSomething(400);
        Pair.done("acb");
        Pair.done(500);

    }

}
