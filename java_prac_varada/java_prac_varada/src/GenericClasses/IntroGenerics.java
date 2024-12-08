package GenericClasses;

import java.util.ArrayList;
import java.util.List;

public class IntroGenerics {

    public static void main(String[] args) {


        List names = new ArrayList();
        names.add("varada");
        String name = (String) names.get(0);//here we do typecasting for string
        System.out.println("first name: "+name);
        names.add(7);//here doesnt give an error takes int value

        //example with generics
        List<String> names2=new ArrayList();
        names2.add("varada");
        String name2=names2.get(0);
        System.out.println("first name: "+name2);
        //names2.add(7); //no suitable method for adding int to the list

    }
}
