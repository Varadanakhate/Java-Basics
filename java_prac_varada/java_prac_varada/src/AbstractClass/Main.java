package AbstractClass;

// Main.java
// Subclass Main

// Define public class Main
public class Main {
    // Define the main method
    public static void main(String[] args) {
        // Create a new Lion object
        Animal lion = new Lion();
        // Call the eat method on the Lion object
        lion.eat();
        // Call the sleep method on the Lion object
        lion.sleep();

        // Print an empty line for separation
        System.out.println();

        // Create a new Tiger object
        Animal tiger = new Tiger();
        // Call the eat method on the Tiger object
        tiger.eat();
        // Call the sleep method on the Tiger object
        tiger.sleep();

        // Print an empty line for separation
        System.out.println();

        // Create a new Deer object
        Animal deer = new Deer();
        // Call the eat method on the Deer object
        deer.eat();
        // Call the sleep method on the Deer object
        deer.sleep();
    }
}
