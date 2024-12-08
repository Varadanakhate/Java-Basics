package MultiThreading;
//multithreading using lambda expressions to reduce the code
//we create anonymous class for both the classes one and two so that the code is reduced
//runnable is a functional interface so we can use lambda expressions
//also explain join and isalive method
//thread priority  as well


    public class ThreadDemo3{
        public static void main(String[] args) throws Exception{

            Thread thread1 = new Thread(()-> {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi"+Thread.currentThread().getPriority());//to print priority of thread along with message
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Set the interrupt flag
                        System.out.println("Thread interrupted: " + e.getMessage());
                    }
                }
            },"1st thread");
            Thread thread2 = new Thread(() ->{

                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello"+Thread.currentThread().getPriority());//to print priority of thread along with message
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Set the interrupt flag
                        System.out.println("Thread interrupted: " + e.getMessage());
                    }
                }
            },"2nd thread");
           /* thread1.setName("1st thread");//to set the name if we dont want the default name
            thread2.setName("2nd thread");*/


         /*   System.out.println(thread1.getName());//to get the default name
            System.out.println(thread2.getName());*/

            //threadpriority
            thread1.setPriority(Thread.MIN_PRIORITY);
            thread2.setPriority(Thread.MAX_PRIORITY);

            System.out.println(thread1.getPriority());
            System.out.println(thread2.getPriority());

            thread1.start();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Set the interrupt flag
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
            thread2.start();
            System.out.println(thread1.isAlive()); //here will give true as t1 is still running
            //join method used so both threads execute and are combined after whic the main thread runs its code which here is the message bye and a exception for the main thread is handled in the main fucntion with throw
            //waits for one thread to complete its execution
            thread1.join(); //wait for t1 to join and to t2 to join
            thread2.join();

            System.out.println(thread1.isAlive()); // here will give false as t2 not running stopped for main thread

            System.out.println("bye");
        }
    }


