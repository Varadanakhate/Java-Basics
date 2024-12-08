package Static.Static;

public class Configuration {
    public static String configValue;

    static{

        configValue="default value";
        System.out.println("static block executed"+configValue);

    }

    public static void main(String[] args) {
        System.out.println("config value"+configValue);
    }
}
