package Strings;

public class StringBasics {
    public static void main(String[] args) {
        String name= "varada";
        String sameName="varada";
        String newName=new String("VARADA");

        System.out.println(name);
        System.out.println(newName);
        System.out.println("varada nakhate");

        /*if(name==sameName){
        System.out.println("both are same ");}

        if(name==newName) {
            System.out.println("both are same ");
        }else{
            System.out.println("both are not same ");//references or place where it points is checked which is not the same - not what is stored but what are references ? pointing at same place or not
        }*/
        if(name.equals(newName)){
            System.out.println("both have same values");
        }else{
            System.out.println("not same");//case senstive
        }
        if(name.equalsIgnoreCase(newName)){
            System.out.println("both have same values");
        }else{
            System.out.println("not same");//not case senstive
        }
    }

}
