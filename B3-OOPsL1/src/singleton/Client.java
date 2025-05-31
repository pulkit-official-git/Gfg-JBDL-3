package singleton;

public class Client {
    public static void main(String[] args) {
        RedisConfig rc = RedisConfig.getInstance();
        System.out.println(rc);
        Temp temp = new Temp();
        Temp.temp();
    }
}
