package arrays;

public class basicsOfArray {
    public static void main(String[] args) {

        //Basics
       /* int age[]; //declaration
        age= new int[5]; //allocation/*/
        int age[]=new int[5];

        age[0]=5;
        age[1]=2;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]); //default value 0 printed

        System.out.println(age.length);

        int marks[]={12,13,14,23}; //intialisation
        System.out.println(marks[3]);

        String names[]= {"siddhesh","varada","sayali","ayush"};
//for loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("name is "+names[i]);
            
        }
        //foreach loop
        for(String name: names){
            System.out.println("for each "+name);
        }


    }
}
