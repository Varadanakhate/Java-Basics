package Practice3;

public class oops {

        public int add(int a, int b) {
            return a + b;
        }


        public int add(int a, int b, int c) {
            return a + b + c;
        }

        public static void main(String[] args) {
            oops obj1 = new oops();


            int result1 = obj1.add(10, 20);
            System.out.println("Sum of 10 and 20: " + result1);

            int result2 = obj1.add(5, 1, 15);
            System.out.println("Sum of 5, 10, and 15: " + result2);
        }
    }
