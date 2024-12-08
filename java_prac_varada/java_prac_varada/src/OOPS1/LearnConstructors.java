package OOPS1;

public class LearnConstructors {
    public static void main(String[] args) {
        Complex num1 = new Complex(2,1);
        Complex num2 = new Complex(4,5);
        num1.print();
        num2.print();
        System.out.println("adding two numbers");
        Complex result= num2.add(num1);
        System.out.println(num1);
        result.print();




    }
}
class Complex {
    int a, b;
//constructor
   /* public Complex(){
        a=5;
        b=9;
        System.out.println("creating a new object");*/
    public Complex(int real){
        a=real;
        b=12;
    }
    public Complex(int a, int b){
        this.a=a; // to remove ambiguity
        this.b=b;
        /*a=real;
        b=imaginary;*/
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }
    Complex add(Complex num2){
        System.out.println(this);
        this.print();
        print();
        Complex newNum=new Complex(a+num2.a,b+num2.b);
            return newNum;
    }

}