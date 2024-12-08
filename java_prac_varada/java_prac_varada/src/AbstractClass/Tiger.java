package AbstractClass;

// Tiger.java
// Subclass Tiger

// Define class Tiger that extends Animal
class Tiger extends Animal {
    // Override the eat method from Animal
    @Override
    public void eat() {
        // Print what the tiger eats
        System.out.println("Tiger eats meat and occasionally hunts in water.");
    }

    // Override the sleep method from Animal
    @Override
    public void sleep() {
        // Print where the tiger sleeps
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}
