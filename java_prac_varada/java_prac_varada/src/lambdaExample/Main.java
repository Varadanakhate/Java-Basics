package lambdaExample;

public class Main {
    public static void main(String[] args) {
        Lambda gmsg=new Lambda() {
            @Override
            public void GreetMsg(String name) {
                System.out.println("hello"+name);
                //throw new UnsupportedOperationException("not supported yet ");
            }
        };
        gmsg.GreetMsg("varada");

        Lambda gm2= (String name) -> {
            System.out.println("hello"+name);
        };
        gm2.GreetMsg("varada");
    }
}
