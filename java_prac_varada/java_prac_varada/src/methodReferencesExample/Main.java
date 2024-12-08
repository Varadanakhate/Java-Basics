package methodReferencesExample;

public class Main {
    public static void main(String[] args) {
        Square s =new Square(4);

       /* Shapes shapes=(Square square)->{
            return square.calculateArea();*/

        //using lambda expressions
        Shapes shapes=Square::calculateArea;

        System.out.println("area "+shapes.getArea(s));
    }
}
