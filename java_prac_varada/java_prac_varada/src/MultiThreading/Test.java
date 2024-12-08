package MultiThreading;

public class Test extends Thread{
    public void run(){
        System.out.println("daemon thread");
        System.out.println("child thread");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        //if main thread doesnt print anything then daemon thread will not be printed aswell
        System.out.println("main thread");
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("new priority"+Thread.currentThread().getPriority());
        //main thread cannot be made daemon
        Test t = new Test();
        t.setDaemon(true);
        t.setPriority(3);
        //before start only should be done
        t.start();
        for (int i = 0; i <5 ; i++) {
            //continuosly will execute that only and then go to the main function
            Thread.yield();
            System.out.println();
            System.out.println("main thread"+i);

        }
    }
}
