/*


public class LearnAnonymousClasses {
    */
/*class InnerClass extends OuterClass{

    }*//*


    // extend object and make anoynymous class

    Outerclass obj = new Outerclass() {
        void sing() {


        }
    };

        public void outerMethod() {

        }

    };
    //lambda functions
    SuperInterface obj3 = () -> {

    };


    public static void main(String[] args) {
        Walkable walkable = (int steps) -> {
            System.out.println("Walked " + steps + " steps");
            return steps;

        };
        walkable.walks(6);

        Walkable obj2 =(int steps) -> 2*steps;
        System.out.println(obj2.walks(8));

    }



interface Walkable{
    int walks(int steps);


}

    //anonymous class cannot make multiple objects but can use a object multiple times
    //create interface and make an anoynymous class
    SuperInterface obj2=new SuperInterface() {
        @Override
        public void InterfaceMethod() {

        }
    };



class Outerclass{
    public void outerMethod(){

    }

}
//anonymous class by interface
//also a functional interface has only one method
@FunctionalInterface
interface SuperInterface{
    void InterfaceMethod();
}

public void main() {
}
//functional interfaces can be used in lambda expressions
*/
