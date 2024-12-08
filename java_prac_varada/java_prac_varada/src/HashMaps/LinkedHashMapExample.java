package HashMaps;

import java.util.LinkedHashMap;
import java.util.Map;
//in linked hashmap we get the output in a particular order only
public class LinkedHashMapExample {
    public static void main(String[] args) {
        //first if we put false then we get ouput in order
        //true : we will then get the first name last as it is accesed recently (most recent entry goes to the bottom
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, true);
        phonebook.put("varada", 1111);
        phonebook.put("sayali", 2222);
        phonebook.put("aditi", 3333);
        phonebook.put("neha", 4444);

        System.out.println(phonebook.get("varada"));

        System.out.println("List of contacts in phonebook: ");
        for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
