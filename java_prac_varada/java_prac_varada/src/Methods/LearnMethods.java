package Methods;

public class LearnMethods {
    public static void main(String[] args) {
        //System.out.println(args[0]);
       /* System.out.println(1);
        System.out.println(2);
        greet();
        System.out.println(3);
        System.out.println(4);*/

        int averageFromFunction = average(4,6,false);
        int doubleFromAverage= averageFromFunction *2;
        System.out.println("hello");
        System.out.println(doubleFromAverage);
        average(2,7,true);
        System.out.println(averageFromFunction);

    }

    public static void greet(){
        System.out.println(5);
        System.out.println("hello world");
        System.out.println(6);
    }

    //method parameters

    public static int average(int a , int b,boolean shouldAverage){
        if(shouldAverage==false){
            return -1;
        }
        int avg=(a+b)/2;
        //System.out.println("the average is "+avg);
        return avg;
    }


}

