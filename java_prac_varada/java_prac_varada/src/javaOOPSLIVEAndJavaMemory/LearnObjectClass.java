package javaOOPSLIVEAndJavaMemory;

class Car{
    String model;
    int year;
    public Car(String model, int year){
        this.model=model;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return "car ka model"+model+"year is "+year;
    }

}

public class LearnObjectClass {
    public static void main(String[] args) {


        Car obj = new Car("Honda", 2022);
        System.out.println(obj);
    }


}
