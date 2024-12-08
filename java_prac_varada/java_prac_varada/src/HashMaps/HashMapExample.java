package HashMaps;

import java.util.HashMap;

//used to store  pairs of value  together
public class HashMapExample {
    public static void main(String[] args) {
        //hashmaps are stored but are not ordered printed randomly  however same entries are not printed same key value is not printed latest one is only printed
        HashMap<String,Integer> phonebook = new HashMap<>();
        phonebook.put("varada",1234);
        phonebook.put("sayali",5678);
        phonebook.put("aditi",12345678);
        phonebook.put("aditi",9999);
        phonebook.put(null,000);
        if(phonebook.containsKey("varada")){
            phonebook.remove("varada");


        }
        phonebook.clear(); //removes all

        System.out.println(phonebook);

    }
}
