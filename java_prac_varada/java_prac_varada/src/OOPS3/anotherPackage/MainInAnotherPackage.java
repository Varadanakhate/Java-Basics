package OOPS3.anotherPackage;
import OOPS3.learnPackage.Teacher;

public class MainInAnotherPackage extends Teacher {
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.teachingClass=4;
        //obj.degree="PHD";//for default cannot be accesed

        MainInAnotherPackage mainInAnotherPackage = new MainInAnotherPackage();
        mainInAnotherPackage.studentsCount=100;
    }
}
