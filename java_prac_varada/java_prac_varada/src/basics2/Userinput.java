package basics2;
import java.util.Scanner;


public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //object created
        System.out.println("enter your age");
        int age= sc.nextInt();
        System.out.println("your age is "+age);

        int firstNumber= sc.nextInt();
        int secondNumber= sc.nextInt();
        int result= firstNumber+secondNumber;
        System.out.println(result);
        sc.close();
//to remove from memory for better
    }
}
