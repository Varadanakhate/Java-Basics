package Practice3;

public class overRide extends oops{

    public int add(int a ,int b){
        return (a+b)*10;
    }

    public static void main(String[] args) {
        overRide result1=new overRide();
        int result=result1.add(3,4);
        System.out.println("the over ridden answer is "+result);

        oops obj2=new oops();
        int sec=obj2.add(3,4,5);
        System.out.println(" output from oops class is"+sec);

        oops obj3=new overRide();
        int result_obj3 = obj3.add(12,5);
        System.out.println("result of Parent obj using child method : " + result_obj3);












    }

}
