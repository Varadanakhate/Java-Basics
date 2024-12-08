package MultiThreading;

//creating interfaces
//after creating the thread it goes into the runnable interface after which jvm allocated processor and leads to running the task and further the task gets completed also it can come to no runnable states as well
//non runnable states are ( sleep(),wait(),suspend()
//runnable interface implements the thread class so the run method which is mentioned in the thread class is overriden in the runnable interface
//better method to create thread as it can implement /inherit two classes at same time

class Bye implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Set the interrupt flag
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class Goodbye implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                //current thread provides the reference
                Thread.currentThread().interrupt(); // Set the interrupt flag
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        //create object of class

        Runnable result1 = new Bye();
        Runnable result2 = new Goodbye();
        //create object of thread class in which pass the above object reference(parameter) in its(threads) constructor
        Thread t1 = new Thread(result1);//result 1 is the reference os the class
        Thread t2 = new Thread(result2);
        //then we start the thread as start method is of the thread

        t1.start();
        //after start we call the run method after whichit goes in the dead state after this if we want to invoke another thread we get an exception hence for this we have to use exception handling for it
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Set the interrupt flag
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
        t2.start(); //we start a thread we do not start the object created here as the object is passed as reference in the constructor of the thread
    }
}




/*
package MultiThreading;

    class Bye implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                } // here the output will now be printed w a half second delay and as this condition may throw an error we are using the try catch method to handle it.

            }
        }
    }

    class Goodbye implements Runnable{

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                //order will depend on the sleep time given as they will be printed randomly as no scheduler is used in the os currently for them.

            }
        }
    }

    public class ThreadDemo2 {
        public static void main(String[] args) {
            Runnable result1 = new Bye();
            Runnable result2 = new Goodbye();
            Thread t1= new Thread(result1);
            Thread t2= new Thread(result2);

            t1.start();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            t2.start();


        }
    }
}*/
