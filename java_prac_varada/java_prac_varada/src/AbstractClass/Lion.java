package AbstractClass;

// Lion.java
// Subclass Lion

// Define class Lion that extends Animal
class Lion extends Animal {
    // Override the eat method from Animal
    @Override
    public void eat() {
        // Print what the lion eats
        System.out.println("Lion eats meat.");
    }

    // Override the sleep method from Animal
    @Override
    public void sleep() {
        // Print where the lion sleeps
        System.out.println("Lion sleeps on grassland.");
    }
}

