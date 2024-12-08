package Methods;

public class LearnMath {


    public static void main(String[] args) {
        int a=4;
        int b=7;
        System.out.println(Math.min(a,b));
        System.out.println(Math.pow(3,4));
        System.out.println(Math.sqrt(16));
        System.out.println(getRandom(10,20));
        System.out.println(Math.floor(5.9));//imediate smallest interger
        System.out.println(Math.ceil(5.9));//imediate largest interg
        System.out.println(Math.round(5.7));
        System.out.println(Math.abs(-3));//positibv number


    }
    public static int getRandom(int a , int b){
        //return (int) (Math.random()*6)+1;
        return(int)(Math.random()*(b-a+1)+a);
    }
    //also involves sin cos tan as well
}
