package collections;

import java.util.*;

public class CollectionImpl {
    public static void main(String[] args) {
        List<Integer>l = new ArrayList<>(List.of(1, 3, 4, 6, 7, 2, 5));
        Collections.sort(l, Collections.reverseOrder());
        System.out.println(l);

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe", 19));
        students.add(new Student(2, "Romil Doe", 20));
        students.add(new Student(3, "rough Doe", 22));
        Collections.sort(students,new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        for(Student student : students) {
            System.out.println(student.name);
        }
        System.out.println(students);


//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        System.out.println(list);
//
//
//
//        List<String> list2 = new LinkedList<>();
//        list2.add("A");
//        list2.add("B");
//        list2.add("C");
//        list2.add("D");
//        System.out.println(list2);
//
//        Set<String> set = new HashSet<>();
//        set.add("D");
//        set.add("B");
//        set.add("C");
//        set.add("D");
//        System.out.println(set);
//
//        Set<String> set2 = new TreeSet<>();
//        set2.add("Apple");
//        set2.add("Banana");
//        set2.add("Cord");
//        set2.add("rough");
//        set2.add("Double");
//        System.out.println(set2);
//
//        Set<String> set3 = new LinkedHashSet<>();
//        set3.add("Apple");
//        set3.add("Banana");
//        set3.add("Cord");
//        set3.add("rough");
//        set3.add("Double");
//        System.out.println(set3);
//
//        Lin


    }
}
