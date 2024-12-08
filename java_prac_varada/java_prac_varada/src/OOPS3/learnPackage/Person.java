package OOPS3.learnPackage;

public class Person {

    public static int count=0;

    public Person(){
        count++;
    }
    private int age;
    private String name;

    //encapsulation allows access acording to its condition
    //boolean canBeChanged = false; //value cannot be changed
    boolean canBeChanged = true;



    //access through us
    //access
    //authorization andvalidation
    public void setAge(int age) {
        if (canBeChanged) {
            if(age>0){
                this.age=age;
            }

        }
    }
    boolean canBeAccessed = false;

    public int getAge() {
        if (canBeAccessed) return age;
        return -1;
    }
    }
    //for printing it
 /*   public int getAge(){
        return age;
    }
}*/
