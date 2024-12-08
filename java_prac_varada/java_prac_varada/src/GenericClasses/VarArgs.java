package GenericClasses;

public class VarArgs {
    public static void main(String[] args) {
        String item1="apple";
        String item2="bananas";
        String item3="mango";
        String[] shopping= {"bread","milk","eggs","bananas"};
        printShoppingList(item1,item2,item3);
        printShoppingList(shopping);
    }

    public static void printShoppingList(String string1,String string2){
        System.out.println(string1);
        System.out.println(string2);
    }
    public static void printShoppingList(String string1,String string2,String string3) {
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println();
    }
    public static void printShoppingList(String[] items){
        for (int i = 0; i < items.length; i++) {
            System.out.println(i+1+":"+items[i]);

        }
        System.out.println();
    }


    }
