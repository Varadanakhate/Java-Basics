package OOPSPractice;

public class Book {
    String title;
    String Author;
    double Price;

    public Book(){
        this.title="unknown";
        this.Author="unknown";
        this.Price= 20.0;

    }

    public Book(String title,String Author){
        this.title=title;
        this.Author=Author;


    }

    public static void main(String[] args) {
        Book book1=new Book();
        System.out.println("book1 title "+book1.title);
        System.out.println("book1 author"+book1.Author);
        System.out.println("book 1"+book1.Price);

        Book book2=new Book("Varada","abc");
        System.out.println("book2 title "+book2.title);
        System.out.println("book2 author"+book2.Author);

    }
}
