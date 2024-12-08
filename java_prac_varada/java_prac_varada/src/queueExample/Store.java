package queueExample;

import java.util.LinkedList;

public class Store {
    public static void main(String[] args) {
        LinkedList<Customer> queue= new LinkedList();
        queue.add(new Customer("Varada"));
        queue.add(new Customer("sayali"));
        queue.add(new Customer("ayush"));
        queue.add(new Customer("aditi"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);


    }
    static void serveCustomer(LinkedList<Customer> queue){
//poll is used inorder to return first customre from the queue and also removes the first costomer from the queue
        Customer c =queue.poll();
        c.serve();

    }
}
