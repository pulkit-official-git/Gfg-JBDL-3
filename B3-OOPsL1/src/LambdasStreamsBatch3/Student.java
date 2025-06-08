package LambdasStreamsBatch3;

public class Student implements Comparable<Student> {

    public Integer id;
    public String name;
    public Long score;
    public Student(Integer id, String name, long score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return o.score.compareTo(score);
    }
}
