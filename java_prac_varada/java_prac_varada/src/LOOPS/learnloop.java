package LOOPS;

import java.util.Scanner;

public class learnloop {
    public static void main(String[] args) {
        //TABLE OF N
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n+" * "+i+" = " +i*n);*/
            //BASIC FORLOP/PRINT NUMBERS
       /* for(int i=0;i<=5;i++){
            System.out.println("hi varada");
            System.out.println(i);*/

            //SUM OF N NATURAL NUMBERS
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
            System.out.println("sum is"+sum);

//SUM OF N EVEN NUMEBRS (sum = sum + 2i)






    }
}
