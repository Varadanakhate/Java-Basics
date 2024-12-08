package MultiThreading;
//thread class already extends in java.lang
//for making a thread extend class by thread
class Hi extends Thread{
    //public void show(){
    //inside pubic void run method ypu mention the task you want your thread to perform
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            System.out.println("hi is printed by"+Thread.currentThread().getName());
            try{Thread.sleep(500);}catch(Exception e){} // here the output will now be printed w a half second delay and as this condition may throw an error we are using the try catch method to handle it.

        }
    }
}
class Hello extends Thread{
    //public void show(){
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            //we can set the name as well
            System.out.println("hello is printed by"+Thread.currentThread().getName());
            try{Thread.sleep(100);}catch(Exception e){}
            //order will depend on the sleep time given as they will be printed randomly as no scheduler is used in the os currently for them.

        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        //you create an object of the class
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        System.out.println("main thread "+ Thread.currentThread().getName());
        System.out.println("main thread "+ Thread.currentThread().isAlive());
//when you say start internally run method is executed hence instead of calling show we call run
        obj1.start();//here you start the thread
        obj2.start();//we call the run method
        //after starting the thread goes into the runnable state

        /*obj1.show(); //first print obj1 hi and then obj 2 hello for multithreading we can have hi hello run simultaneously
        obj2.show();*/
    }
}
