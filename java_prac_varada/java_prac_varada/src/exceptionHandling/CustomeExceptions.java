package exceptionHandling;

import java.util.Scanner;

public class CustomeExceptions {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
       try{
           int age=sc.nextInt();

        if(age>100) {
            //throw new MyException("my error is this");
            throw new ArithmeticException("MORE THAN 100 NOT ALLOWED");
        }
        }catch(Exception e){
               System.out.println(e);

           }


    }
}
class MyException extends Exception{
    public MyException(String message){
        super(message);

    }

}