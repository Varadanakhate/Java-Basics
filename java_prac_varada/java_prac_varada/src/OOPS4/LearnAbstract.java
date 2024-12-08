package OOPS4;



public class LearnAbstract {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.accelerate();
        c1.brakes(4);
        c1.honks();


    }
}
abstract class Vehicle {

    abstract void accelerate();
    abstract int brakes(int wheels);
    void honks(){
        System.out.println("vehicle honks");
    }

}
class Car extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("Car is Accelerating");

    }




    @Override
    int brakes(int wheels) {
        return wheels;

    }
}

//Vehicle v1=new Vehicle(); // cannot be made as vehicle is an abstract class