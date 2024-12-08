package OOPS1;

public class MainClass {
    public static void main(String[] args) {

        //int age=12;
        Dog d1= new Dog();//newobject has been made using keyword new
        d1.name = " Tommy";
        d1.bark();
        d1.walk();
        Dog d2 = new Dog();
        d2.name= "Leo";
        d2.walk();

        Complex num1 = new Complex(2,3);
        num1.a = 3;
        num1.b = 5;
        num1.print();

    }


    }






class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name+"dog is walking");
    }
    void bark(){
        System.out.println(name+"dog is barking");
    }

}
class Cat{

}
