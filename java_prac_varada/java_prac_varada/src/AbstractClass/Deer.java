package AbstractClass;

// Deer.java
// Subclass Deer

// Define class Deer that extends Animal
class Deer extends Animal {
    // Override the eat method from Animal
    @Override
    public void eat() {
        // Print what the deer eats
        System.out.println("Deer grazes on grass and leaves.");
    }

    // Override the sleep method from Animal
    @Override
    public void sleep() {
        // Print where the deer sleeps
        System.out.println("Deer sleeps in open fields.");
    }
}
