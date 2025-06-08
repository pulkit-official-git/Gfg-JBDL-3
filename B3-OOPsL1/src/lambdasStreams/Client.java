package lambdasStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
//        List<Integer>l = new ArrayList<>(List.of(1, 3, 4, 6, 7, 2, 5));
//        Collections.sort(l, Collections.reverseOrder());
//        System.out.println(l);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe", 19));
        students.add(new Student(2, "Romil Doe", 20));
        students.add(new Student(3, "rough Doe", 22));
//        Collections.sort(students,new Comparator<Student>() {
//            public int compare(Student o1, Student o2) {
//                return o2.name.compareTo(o1.name);
//            }
//        });




//        Collections.sort(students, new StudentNameComparator());
//        for (Student student : students) {
//            System.out.println(student.id);
//        }

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.name.compareTo(o1.name);
//            }
//        });


//        Collections.sort(students,(a,b)->{return a.name.compareTo(b.name);});
//        for (Student student : students) {
//            System.out.println(student.id);
//        }

//
//        Collections.sort(students,(a,b)->b.name.compareTo(a.name));
//        for (Student student : students) {
//            System.out.println(student.id);
//        }
//
//
//        Calculator c = (a,b)->a-b;
//        System.out.println(c.calculate(10,30));


        List<Integer> l1 = List.of(5,4,6,1,3,7,8);

        Stream<Integer> s1 = l1.stream();
        System.out.println(s1);
//        System.out.println(s1.limit(5).count());
//        System.out.println(s1.limit(6).count());
        s1.forEach((x) -> System.out.println(x));

        List<Integer> filterList = l1
                .stream()
                .filter((e)-> e%2==0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(filterList);


        List<Integer> evenSquared = l1
                .stream()
                .filter((e)-> e%2==0)
                .map(e->e*e)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(evenSquared);


        List<Integer> evenSquaredSorted = l1
                .stream()
                .filter((e)-> e%2==0)
                .map(e->e*e)
                .sorted((a,b)->b-a)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(evenSquaredSorted);


        Integer evenSquaredSortedSum = l1
                .stream()
                .filter((e)-> e%2==0)
                .map(e->e*e)
                .sorted((a,b)->b-a)
                .reduce(0,(a,b)->a+b);
        System.out.println(evenSquaredSortedSum);


        Integer evenSquaredSortedMax = l1
                .stream()
                .filter((e)-> e%2==0)
                .map(e->e*e)
                .sorted((a,b)->b-a)
                .reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
        System.out.println(evenSquaredSortedMax);


        Integer evenSquaredSortedMin = l1
                .stream()
                .filter((e)-> e%2==0)
                .map(e->e*e)
                .sorted((a,b)->b-a)
                .reduce(Integer.MAX_VALUE,(a,b)->Math.min(a,b));
        System.out.println(evenSquaredSortedMin);



    }

}
