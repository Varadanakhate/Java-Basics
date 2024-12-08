package Conversion;

import java.util.Scanner;

public class BinaryToDecimal {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter binary number:");
            String binaryString = sc.nextLine();

            // Convert binary string to decimal
            int decimal = binaryStringToDecimal(binaryString);

            System.out.println("Decimal value is: " + decimal);
        }

        public static int binaryStringToDecimal(String binaryString) {
            int decimal = 0;
            int length = binaryString.length();

            for (int i = 0; i < length; i++) {
                // Get the character at position i and convert it to an integer (0 or 1)
                int bit = Character.getNumericValue(binaryString.charAt(i));
                // Calculate the power of 2 for the current position
                int power = length - i - 1;
                // Add the value to the decimal result
                decimal += bit * Math.pow(2, power);
            }

            return decimal;
        }
    }


