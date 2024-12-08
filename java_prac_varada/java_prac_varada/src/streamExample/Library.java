package streamExample;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();

        //for parallel streams just change STream() to parallelStream() it iwll enhance the perfomance speed-used for large datasets not small
        books.stream()
                .filter(book -> book.getAuthor().startsWith("j"))
                .forEach(System.out::println);
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("abc", "Author A"));
        books.add(new Book("def", "Author D"));
        books.add(new Book("ghi", "Author G"));
        books.add(new Book("jkl", "John Doe")); // Example author starting with 'J'
        books.add(new Book("mno", "Author M"));
        books.add(new Book("pqr", "Author P"));
        books.add(new Book("stu", "Author S"));
        books.add(new Book("vwx", "Author V"));
        return books;
    }
}


