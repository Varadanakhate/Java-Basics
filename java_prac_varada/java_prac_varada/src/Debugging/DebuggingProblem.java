package Debugging;

public class DebuggingProblem {
    public static String Hello(String name){
        String msg = "hello "+name;
        return msg;
    }

    public static void main(String[] args) {
        //has one variable as args while debugging hence shows only on variable in the threads and variables section
        String message = Hello("hi varada");
        System.out.println(message);
    }
}
