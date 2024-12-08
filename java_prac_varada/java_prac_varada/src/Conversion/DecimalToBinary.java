package Conversion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number;
        int i = 0;
        int binary[]=new int[100];//size is 100
        Scanner sc=new Scanner(System.in); //create user input //create an object caled scanner
        System.out.println("enter decimal number");
        number= sc.nextInt(); //assign the value to number and store the next integer value in it

        while(number!=0){
            binary[i]=number%2;
            number=number/2;
            i++;
            //example:
            //13
        /*    13!=0 go into while loop
                    binary =13/2==1(remainder)
                    1 stored in binary
                    13-1%2=6
                            remainder 0;
            6/2=3(remainder zero)*/



        }
        System.out.println("binary value is : ");
        for (int j = i-1; j >=0 ; j--) {
            System.out.println(" "+binary[j]);

        }



    }
}
