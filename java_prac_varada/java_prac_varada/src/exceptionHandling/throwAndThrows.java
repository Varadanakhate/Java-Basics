package exceptionHandling;

public class throwAndThrows {
    public static void main(String[] args) {
        int a[] = new int[5];
        //throws is put in the method declaration to declare the type of exception that might occur within it
        //throw keyword is used to explicitly throw a single exception.
        try {
            getNumberFromArray(a);
        } catch (Exception e) {
            System.out.println("catched the exception" + e.getMessage());
        }
    }
    static int getNumberFromArray(int a[])throws ArithmeticException{
        return a[8];
    }
}
