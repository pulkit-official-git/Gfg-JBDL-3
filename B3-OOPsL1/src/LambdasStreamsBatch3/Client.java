package LambdasStreamsBatch3;

import collections.Student;
import collections.StudentNameComparator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        //runnable
        //callable
        //comparable
        //comparator

//        List<Student> students = new ArrayList<>();
//        students.add(new Student(1, "John Doe", 19));
//        students.add(new Student(2, "Romil Doe", 20));
//        students.add(new Student(3, "rough Doe", 22));
//        Collections.sort(students,new Comparator<collections.Student>() {
//            public int compare(Student o1, Student o2) {
//                return o2.name.compareTo(o1.name);
//            }
//        });

//        for(Student student : students) {
//            System.out.println(student.name);
//        }
//        System.out.println(students);

        //way 1
//        Collections.sort(students,new StudentNameComparator());
//        for (Student student : students) {
//            System.out.println(student.name);
//        }

        //way 2
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//        for (Student student : students) {
//            System.out.println(student.name);
//        }


        //way3
//        Collections.sort(students,(Student o1, Student o2)->
//        {return o2.name.compareTo(o1.name);});
//        for (Student student : students) {
//            System.out.println(student.name);
//        }

//        Collections.sort(students,(a,b)-> a.name.compareTo(b.name));
//        for (Student student : students) {
//            System.out.println(student.name);
//        }
//
//        Calculator c = (a,b)->a-b;
//        System.out.println(c.calculate(30,30));

        List<Integer> l1 = List.of(5,6,3,4,8,9,1,3,6);
        Stream<Integer> stream1 = l1.stream();
        System.out.println(stream1);
        stream1.limit(6).forEach(a-> System.out.println(a));

        List<Integer>evenList = l1
                .stream()
                .filter(a->a%2==0)
                .collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer>evenListSquares = l1
                .stream()
                .filter(a->a%2==0)
                .map(a->a*a)
                .collect(Collectors.toList());
        System.out.println(evenListSquares);


        List<Integer>evenListSquaresSorted = l1
                .stream()
                .filter(a->a%2==0)
                .map(a->a*a)
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println(evenListSquaresSorted);

        Integer evenListSquaresSortedSum = l1
                .stream()
                .filter(a->a%2==0)
                .map(a->a*a)
                .sorted((a,b)->b-a)
                        .reduce(0,(a,b)->a+b);
        System.out.println(evenListSquaresSortedSum);

        Integer evenListSquaresSortedMax = l1
                .stream()
                .filter(a->a%2==0)
                .map(a->a*a)
                .sorted((a,b)->b-a)
                .reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
        System.out.println(evenListSquaresSortedMax);

        Integer evenListSquaresSortedMin = l1
                .stream()
                .filter(a->a%2==0)
                .map(a->a*a)
                .sorted((a,b)->b-a)
                .reduce(Integer.MAX_VALUE,(a,b)->Math.min(a,b));
        System.out.println(evenListSquaresSortedMin);

        List<Integer>l3 = new ArrayList<>();
        Optional<Integer> evenListSquaresSortedFindFirst = l3
                .stream()
                .filter(a->a%2==0)
                .map(a->a*a)
                .sorted((a,b)->b-a)
                .findFirst();
//        if (evenListSquaresSortedFindFirst.isPresent()) {
            System.out.println(evenListSquaresSortedFindFirst.get());
//        }
//        System.out.println(evenListSquaresSortedFindFirst);






    }
}
