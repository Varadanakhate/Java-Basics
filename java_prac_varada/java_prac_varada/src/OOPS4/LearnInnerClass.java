package OOPS4;

public class LearnInnerClass {
    class Toy{
        int price;
    }
    //static class
    static class Playtsation{
        int price;

    }

    public static void main(String[] args) {
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy=obj.new Toy(); //for nonstatic
        toy.price=45;
        Playtsation playtsation=new LearnInnerClass.Playtsation();//for static

    }
}
