package Constructors;

public class Student {

    int id;

    String name = "raman";

    double score;

    int attendance;

    public Student(int id, String name, double score, int attendance) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.attendance = attendance;
    }

    public Student(){

    }

    public Student(int id, String name){

    }

    public Student(Student s2){
        this.id = s2.id;
        this.name = s2.name;
        this.score = s2.score;
        this.attendance = s2.attendance;

    }

}
