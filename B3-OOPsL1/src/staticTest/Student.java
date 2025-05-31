package staticTest;

public class Student {

    int id;
    String name;
    int age;
    final static String universityName = "University";

    public static String getUniversityName(){
        return universityName;
    }
}
