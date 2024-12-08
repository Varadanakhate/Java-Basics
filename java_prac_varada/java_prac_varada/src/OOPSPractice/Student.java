package OOPSPractice;

public class Student {
    String studentId;
    String StudentName;
    int grade;

    public Student(){
        this.studentId="abc";
        this.StudentName="xyz";
        int grade= 10;

    }

    public Student(String studentId,String StudentName){
        this.studentId="aaa";
        this.StudentName="bbb";


    }

    public static void main(String[] args) {
        Student student1=new Student();
        System.out.println("book1 title "+student1.studentId);
        System.out.println("book1 author"+student1.StudentName);
        System.out.println("book 1"+student1.grade);

       /* Book book2=new Book("Varada","abc");
        System.out.println("book2 title "+book2.title);
        System.out.println("book2 author"+book2.Author);
*/
    }
}

