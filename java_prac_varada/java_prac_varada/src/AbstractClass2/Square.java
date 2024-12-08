package AbstractClass2;

// Square.java
// Define a class named Square that extends GeometricShape
class Square extends GeometricShape {
    // Declare a private instance variable for the side of the square
    private double side;

    // Define a constructor that initializes the side of the square
    public Square(double side) {
        // Assign the parameter to the instance variable
        this.side = side;
    }

    // Override the area method from GeometricShape
    @Override
    // Implementation of the area method that calculates and returns the area of the square
    public double area() {
        // Calculate and return the area by squaring the side length
        return side * side;
    }

    // Override the perimeter method from GeometricShape
    @Override
    // Implementation of the perimeter method that returns the perimeter of the square
    public double perimeter() {
        // Calculate and return the perimeter by multiplying the side length by 4
        return 4 * side;
    }
}
