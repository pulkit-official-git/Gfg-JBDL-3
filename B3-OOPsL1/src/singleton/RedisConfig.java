package singleton;

public class RedisConfig {

    private String url;
    private String username;
    private String password;
    private long port;

    private static RedisConfig instance = null; // lazy
//    private static RedisConfig instance = new RedisConfig("redis://localhost:6379", "root", "root", 6379);

    private RedisConfig(String url, String username, String password, long port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public static RedisConfig getInstance() {
        if (instance == null) {
            synchronized (RedisConfig.class) {
                if (instance == null) {
                    instance = new RedisConfig("redis://localhost:6379", "root", "root", 6379);
                }
            }
        }
        return instance;
    }

}
