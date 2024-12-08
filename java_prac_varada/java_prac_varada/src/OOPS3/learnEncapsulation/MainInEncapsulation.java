package OOPS3.learnEncapsulation;

import OOPS3.learnPackage.Person;

public class MainInEncapsulation {
    public static void printHello(){
        System.out.println("hello");
    }
    public void printHi(){
        System.out.println("HI");//cannot all   without making an object of the class
    }
    static{
        System.out.println("called from the static block");

    }
    public static void main(String[] args) {
       // MainInEncapsulation.printHello();
        Person p1= new Person();
        p1.setAge(12); // you can set the age with set age as it is private for accessing from another class

        //System.out.println(p1.getAge()); //using get you can print it because age is private
        //p1.count=50;
        System.out.println("from the main method");

        Person p2=new Person();
        Person p3=new Person();
        System.out.println(p2.count);

        //encapsulation allows access acording to its condition

        //System.out.println(Math.max(3,6));*///no need to make an object


    }
    static {
        System.out.println("called from the second static block");
    }
}
