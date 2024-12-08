package Practice3;

public class TryCatchFinallyExapmple {

    public static void main(String[] args) {

        int num = 10;
        try {
            int result;
            result = num/10;

        }catch(NumberFormatException number_e){
            number_e.printStackTrace();
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }catch (Exception e){
            e.getMessage();
        }
        finally{
            System.out.println(" Finally called");
        }

    }
}
