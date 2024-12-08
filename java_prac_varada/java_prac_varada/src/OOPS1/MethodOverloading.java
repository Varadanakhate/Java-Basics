package OOPS1;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj= new Greet();
        obj.greetings();
        obj.greetings("varada");
        obj.greetings("varada",5);
    }
}
class Greet{
    void  greetings(){
        System.out.println("hello good morning");
    }
    //same method different parameter , method overloading
    void greetings(String name){
        System.out.println("hello"+name+",Good Morning");
    }
    void greetings(String name, int count){
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " +name+", Good morning ");

        }
    }
}
