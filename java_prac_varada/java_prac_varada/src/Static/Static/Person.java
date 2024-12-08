package Static.Static;
//nested classes
public class Person {// Outer class Person

        // Inner class Address
        class Address {
            // Instance variables for city and state
            String city;
            String state;

            // Constructor for Address class
            Address(String city, String state) {
                this.city = city;
                this.state = state;
            }

            // Method to display address details
            void displayAddress() {
                System.out.println("City: " + city + ", State: " + state);
            }
        }

        // Main method to demonstrate creating an instance of the inner class
        public static void main(String[] args) {
            // Creating an instance of the outer class Person
            Person person = new Person();

            // Creating an instance of the inner class Address
            Person.Address address = person.new Address("New Delhi", "ND");

            // Calling the displayAddress method to print address details
            address.displayAddress();
        }
    }


