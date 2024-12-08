package OOPS3.learnPackage;

public class Teacher {
    public int teachingClass;
    private int id;
    String degree;//default access modiefier

    protected int studentsCount;//protected available to particular class only 

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass=12;
        //obj.id=123;
        obj.degree="PHD";
    }


}
