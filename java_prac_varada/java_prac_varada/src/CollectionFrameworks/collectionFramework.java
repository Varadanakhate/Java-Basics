package CollectionFrameworks;

import java.util.LinkedList;

public class collectionFramework {
    //linked list
    //in linked list you can insert remove a lot of elemtns from the list from middle
    //better if more elements to be added
    //array list is faster and takes less space
    public static void main(String[] args) {
        LinkedList<String> myList=new LinkedList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        System.out.println(myList);
        myList.remove("b");
        System.out.println(myList);



    }
}
