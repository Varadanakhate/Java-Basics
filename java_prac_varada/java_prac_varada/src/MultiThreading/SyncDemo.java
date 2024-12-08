package MultiThreading;

import javax.imageio.metadata.IIOMetadataFormatImpl;
//synchronization used so that the specific thread runs first and then the next thread runs so no issue occurs . we can synchronize the threads correctly so that which should run first example: booking of seats
//gives a fix output which may not be the case if synchronized is not used
//control accessibility of multiple threads

class Counter{
    int count;
    //inorder for the count to run properly when two threads are accessing it we add synchronized so the count increments in an synchronized manner for both the threads
    //synchronized= one thread at a time other doesnt access
    //add synchronized keyword before a method
    //also use static word for the initial initialization here int count will be made static
    //public static synchronized //used so that multiple objects created in the psvm can be synchronized

    public synchronized void  increment(){
        count++;
    }

}

public class SyncDemo {
    public static void main(String[] args)throws Exception {
        //here only one object is created not multiple whereas if c1, c2 created then use keyword stat
        Counter c=new Counter();
        /*c.increment();
        c.increment();*/

        Thread t1=new Thread(new Runnable() {
            //here we have called the method run from the thread class already made hence run is aoverridden here
            //extends is not used or runnable not implemented so still we have overridden the public void run method
            //lock method for object  is used by the two threads according to the synchronized keyword first the initial thread is declared an dgiven the lock and after its execution the lock is given to the next thread which executes its part.
            //synchronized block is to synchronize a particular part of code not the whole method , for this create method :  synchronized(this) / synchronized(object reference) and then put the code which was to be synchronized in it
            //for class lock is also there - for multiple classes
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();

                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();

                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count"+c.count);

    }
}
