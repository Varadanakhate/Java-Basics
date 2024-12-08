package AbstractClass2;

// Triangle.java
// Define a class named Triangle that extends GeometricShape
class Triangle extends GeometricShape {
    // Declare private instance variables for the sides of the triangle
    private double side1;
    private double side2;
    private double side3;

    // Define a constructor that initializes the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        // Assign the parameters to the instance variables
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override the area method from GeometricShape
    @Override
    // Implementation of the area method that calculates and returns the area of the triangle
    public double area() {
        // Calculate the semi-perimeter of the triangle
        double s = (side1 + side2 + side3) / 2;
        // Calculate and return the area using Heron's formula
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    // Override the perimeter method from GeometricShape
    @Override
    // Implementation of the perimeter method that returns the perimeter of the triangle
    public double perimeter() {
        // Return the sum of the sides of the triangle
        return side1 + side2 + side3;
    }
}
