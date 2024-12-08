package OOPSPractice;

public class Constructors{
     private String name;
     private int age;


    public Constructors() {
        this.name = "unknown";
        this.age = 0;
    }

    public static void main(String[] args) {
        Constructors myConstructor = new Constructors();

        System.out.println("constructors name " + myConstructor.name);
        System.out.println("age " + myConstructor.age);
    }


}