package Strings;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter first name");
        String firstName = sc.nextLine();


        System.out.println("Enter your last name");
        //String lastName = sc.nextLine();
        String lastName = sc.next();//only prints first string

        System.out.println("your full name is "+firstName+" "+lastName);
        System.out.println(firstName+lastName);
*/
        String name= "VaRaDa88";


      /*  System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("Carpet".startsWith("Car"));
        char temp = ("Carpet".charAt(3));
        System.out.println(temp);*/

     /*   int age =123;
        String stringAge = String.valueOf(age);
        System.out.println(age+2);//125
        System.out.println(stringAge+2);//1232*/

        String sentence = "Varada is small";
        String newSentence = sentence.replace("Varada","Sayli");
        System.out.println(sentence);
        System.out.println(newSentence);
        System.out.println(sentence.contains ("Varada"));

        String substring = sentence.substring(2,5);//inclusive exclusive
        System.out.println(substring);


    }
}
