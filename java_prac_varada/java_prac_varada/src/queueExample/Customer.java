package queueExample;

public class Customer {
    private boolean hasbeenServed;
    private String name;

    public Customer(String name){
        hasbeenServed=false;
        this.name=name;

    }

    public void serve(){
        hasbeenServed=true;
        System.out.println(name+"has been served");
    }
//overriden the customer naem of to string method so that whne the customers name is added in the queue it will return the customer name while printing
    @Override
    public String toString(){
        return name;
    }
}
