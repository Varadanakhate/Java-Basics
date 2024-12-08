package exceptionHandling;

public class TryCatchFinallyBlock {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("bye guys");
        try {
            System.out.println(a[8]); //if errror occurs catch will be printed if not then will come as 0
        } catch (Exception e) {
            System.out.println("exceptions handled");

        }finally {
            System.out.println("i will run always");//willl always execute . Can be used to stop the services that were going on before the exception error occuring//does not execute when exit () method used / during a death of thread


        }
        System.out.println("bye world");

    }
}
