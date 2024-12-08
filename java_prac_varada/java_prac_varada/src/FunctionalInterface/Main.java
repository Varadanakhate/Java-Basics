package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        GreetingMesssage gm=new GreetingMesssage() {
            @Override
            public void greet(String name) {
                System.out.println("hello"+name);
                //throw new UnsupportedOperationException("not supported yet ");
            }
        };
        gm.greet("varada");
    }
}
