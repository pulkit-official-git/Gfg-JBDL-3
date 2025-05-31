package singleton;

public class Temp {

    public static void temp(){
        RedisConfig rc2 = RedisConfig.getInstance();
        System.out.println(rc2);
    }
}
