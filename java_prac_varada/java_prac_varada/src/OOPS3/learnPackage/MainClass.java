package OOPS3.learnPackage;
//import java.util.Scanner; //list arrays all one by one you can import
import OOPS3.learnEncapsulation.MainInEncapsulation;

import java.util.*;//import all


public class MainClass {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        List<Integer>list=new ArrayList<>();*/

        Teacher obj = new Teacher();
        obj.teachingClass=12;
        //obj.id=123;
        obj.degree="PHD";
        MainInEncapsulation.printHello();

    }
}
