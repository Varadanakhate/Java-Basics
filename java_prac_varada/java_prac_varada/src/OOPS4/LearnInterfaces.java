package OOPS4;

public class LearnInterfaces {
    //Animal a1= new Animal() {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.drinks();
        System.out.println(Animal.LEGS);


    }


}
interface  Pet {
    void walk();
    void drinks();
}

interface Animal{
    public static final int LEGS =4;
    void eats();
    void drinks();
    default void sings(){
        System.out.println("animal is singing");
    }
}
class Monkey implements Animal, Pet{

    public void eats(){
        System.out.println("monkey is eating");
    }

    @Override
    public void walk() {

    }

    @Override
    public void drinks() {
        System.out.println("monkey is drinks");

    }
}
