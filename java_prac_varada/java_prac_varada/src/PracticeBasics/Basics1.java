package PracticeBasics;
import java.util.Arrays;
import java.util.Scanner;

public class Basics1 {


    public static void main(String[] args) {
        //first name last name greeting from the user

  /*      Scanner sc = new Scanner(System.in);
        System.out.println("input your first name");
        String fname =sc.next();
        System.out.println("input your last name");
        String lname=sc.next();
        System.out.println("Hello "+fname+" "+lname);*/

        //sum of two numbers
//without user input
   /*     int a=3;
        int b=5;
        int sum= a+b;

        System.out.println("the sum of two numbers is "+sum);
*/

        //with user input
       /* Scanner sc = new Scanner(System.in);
        System.out.println("input your first num");
        int num1 =sc.nextInt();
        System.out.println("input your second name");
        int num2=sc.nextInt();
        int sum= num1+ num2;
        System.out.println("the sum of two numbers is "+sum);*/

        //print a table
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("input your first num");
        int num1 =sc.nextInt();

        for (int i = 0; i < 11; i++) {
            int mult=num1*i;
            System.out.println(num1+"*"+i+"="+mult);

        }*/

        //average of numbers
        //initialize
        /*double sumA=0;
        int count=1;
//user input to take total numbers
        Scanner sc = new Scanner(System.in);



//prompt user to input the number n for how many to calculate average
        System.out.println("total numbrs");
        int n=sc.nextInt();



//use loop to calculate n numbers and calculate their sum
        while(count<=n) {


            sumA += sc.nextInt();
            count += 1;
        }

            double AvgA=(sumA/n);

            System.out.println("average is "+AvgA);
        }
*/
        //swap two variables

 /*       int a, b, temp;
        a = 23;
        b = 25;

        System.out.println("a is " + a + " b is " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping a is " + a + " b is " + b);
    }*/

        //java number to compare the two numbers

        /*Scanner sc = new Scanner(System.in);
        int number1; // First number to compare
        int number2; // Second number to compare

        // Prompt the user to input the first integer
        System.out.print("Input first integer: ");
        number1 = sc.nextInt(); // Read the first number from the user

        // Prompt the user to input the second integer
        System.out.print("Input second integer: ");
        number2 = sc.nextInt(); // Read the second number from the user

        // Compare and display the results
        //printf is used when we have to print formatted strig basically for to return  a value for example comparing a+b =c we need to use %d
        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);*/

        //sumof integers

/*        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter the number: ");

        // Read the integer from the user
        int n = sc.nextInt();

        // Calculate and display the sum of the digits
        System.out.println("The sum is " + sumDigits(n));
    }

    // Method to calculate the sum of the digits of an integer
    public static int sumDigits(int n) {
        int sum = 0;

        // Calculate the sum of the digits
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;*/

//compare two numbers
   /*     int a=3;
        int b =7;

        if (a>b) {
            System.out.println("a is greater than b");
        }else if(b>a){
            System.out.println("b is greater than a");

        }else{
            System.out.println("a is equal to b");
        }*/

        //reverse a string
/*
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the string: ");
        String original = sc.next();

        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);


    }

    private static String reverseString(String original) {
    String reversed=" ";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        return reversed;*/

        //count numbers
        // Create a Scanner object for user input
               /* Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a string
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                // Initialize counters for different character types
                int letterCount = 0;
                int spaceCount = 0;
                int numberCount = 0;
                int otherCount = 0;

                // Iterate through each character in the string
                for (char ch : input.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        letterCount++;
                    } else if (Character.isDigit(ch)) {
                        numberCount++;
                    } else if (Character.isWhitespace(ch)) {
                        spaceCount++;
                    } else {
                        otherCount++;
                    }
                }

                // Display the counts
                System.out.println("Letters: " + letterCount);
                System.out.println("Spaces: " + spaceCount);
                System.out.println("Numbers: " + numberCount);
                System.out.println("Other characters: " + otherCount);
*/
//odd numbers from 1-100
/*
        for (int i = 1; i < 100; i++) {
            if(i%2!=0){
                System.out.println(i);
            }

        }*/

        //print even 1 odd 0

   /*     Scanner sc = new Scanner(System.in);
        System.out.println("input your first num");
        int n =sc.nextInt();

        if(n%2==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }*/

        // Create a Scanner object for user input
     /*           Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter the number of elements
                System.out.print("Enter the number of elements in the array: ");
                int n = scanner.nextInt();

                // Ensure the array length is at least 1
                if (n < 1) {
                    System.out.println("Array length must be at least 1.");
                    return;
                }

                // Create and populate the original array
                int[] originalArray = new int[n];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < n; i++) {
                    originalArray[i] = scanner.nextInt();
                }

                // Create the swapped array
                int[] swappedArray = new int[n];

                // Swap the first and last elements
                if (n == 1) {
                    // If there's only one element, no swap needed
                    swappedArray[0] = originalArray[0];
                } else {
                    // Swap first and last elements
                    swappedArray[0] = originalArray[n - 1];
                    swappedArray[n - 1] = originalArray[0];
                    // Copy the middle elements unchanged
                    for (int i = 1; i < n - 1; i++) {
                        swappedArray[i] = originalArray[i];
                    }
                }

                // Display the original and swapped arrays
                System.out.println("Original Array: " + Arrays.toString(originalArray));
                System.out.println("Swapped Array: " + Arrays.toString(swappedArray));

                // Close the scanner
                scanner.close();
            }
        }*/

        // Create a Scanner object for user input
         /*       Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter the size of the arrays
                System.out.print("Enter the size of the arrays: ");
                int size = scanner.nextInt();

                // Check if the size is valid
                if (size <= 0) {
                    System.out.println("Size must be a positive integer.");
                    return;
                }

                // Initialize the arrays
                int[] array1 = new int[size];
                int[] array2 = new int[size];
                int[] result = new int[size];

                // Read elements for the first array
                System.out.println("Enter " + size + " elements for the first array:");
                for (int i = 0; i < size; i++) {
                    array1[i] = scanner.nextInt();
                }

                // Read elements for the second array
                System.out.println("Enter " + size + " elements for the second array:");
                for (int i = 0; i < size; i++) {
                    array2[i] = scanner.nextInt();
                }

                // Multiply corresponding elements
                for (int i = 0; i < size; i++) {
                    result[i] = array1[i] * array2[i];
                }

                // Display the result array
                System.out.println("Resulting Array after multiplication:");
                System.out.println(Arrays.toString(result));

            }*/

        // Create a Scanner object for user input
      /*      Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Prompt the user to enter the word to check
            System.out.print("Enter the word to check: ");
            String wordToCheck = scanner.nextLine();

            // Check if the input string starts with the specified word
            if (inputString.startsWith(wordToCheck)) {
                System.out.println("The string starts with the specified word.");
            } else {
                System.out.println("The string does not start with the specified word.");
            }

            // Close the scanner
            scanner.close();
        }*/
        //}

        //pallindrome , fibonacci , factorial, binary tree, tree traversals


    }
}






























