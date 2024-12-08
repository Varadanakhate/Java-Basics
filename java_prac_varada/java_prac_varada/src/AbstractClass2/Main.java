package AbstractClass2;

// Define the Main class
public class Main {
    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create a Triangle object with sides 4, 5, and 6
        GeometricShape triangle = new Triangle(4, 5, 6);
        // Create a Square object with side length 6
        GeometricShape square = new Square(6);



        // Print the area of the triangle
        System.out.println("Triangle Area: " + triangle.area());
        // Print the perimeter of the triangle
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        // Print the area of the square
        System.out.println("Square Area: " + square.area());
        // Print the perimeter of the square
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}

