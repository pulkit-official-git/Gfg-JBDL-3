package polymorphism;

public class B {

    int id;

    public void eat(){
        System.out.println("B eat");
    }

    public void eat(int a){
        System.out.println("B eat");
    }

    public void eat(String a){
        System.out.println("B eat");
    }

    public void eat(float a){
        System.out.println("B eat");
    }

    public void eat(String a,int b){
        System.out.println("B eat");
    }
}
