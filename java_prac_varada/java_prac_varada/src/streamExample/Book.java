package streamExample;
//streams are used instead of the for each loops for better code : it uses internal iteration instead of external iteration
//they have two methods in it filter which just iterates through out till the end and the lazy method
public class Book {
    private String author;
    private String title;

    public Book(String author,String title){
        this.author=author;
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
@Override
    public String toString(){
        return ("author "+author+"title "+title);
    }
}
