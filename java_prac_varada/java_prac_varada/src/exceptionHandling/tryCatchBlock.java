package exceptionHandling;

public class tryCatchBlock {
    public static void main(String[] args) {
/*
        int a[]=new int[5];

        System.out.println("bye guys");*/
        //System.out.println(a[8]);//Index 8 out of bounds for length 5
//so as to the code not stopping because of any exceptions we use try catch block
        /*try{
            int result =5/0;
            System.out.println(a[8]);




        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("tried to access the out of bound element");
        }catch(ArithmeticException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);
        }*/

        // to reduce number of statements

        int a[]=new int[5];
        System.out.println("bye guys");
        try {
            int result = 5 / 0;
            System.out.println(a[8]);




     /*   }catch(ArrayIndexOutOfBoundsException| ArithmeticException| NullPointerException e){

            System.out.println("handling the exception");
        }catch (RuntimeException e){

        }*/
        }catch(Exception e){
            System.out.println("all exception handled");
        }

        System.out.println("hello varada");//wont print this line
    }
}
