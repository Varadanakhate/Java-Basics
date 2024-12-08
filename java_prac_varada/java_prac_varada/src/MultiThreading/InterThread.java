package MultiThreading;
//interthread communication
//whenever we use wait we need to use synchronized
//waitused then we use notify because when we ask out one thread to wait it had to be notified to restart again insleep it automatically restarts which may not give youone after the other output that we want
//as here we need a count that when rpoducer produces consumer consuemes so similarly we need to wait until the producer produces and then consumer consumes it after being notified about it, here ten the sleep time wont matter as there after producer ony the consumer will act
class Q{
    int num;
    boolean valueSet=false;

   public synchronized void put(int num){
       while(valueSet){
           //time limit in wait can be provided so no notify reqd
           //current thread goes into waiting state so that the other thread/main thread is able to run properly and the current thread waits for that time further which is notified and then the current thread is executed
           try{wait();}catch(Exception e){}
       }
       System.out.println("put "+num);
       this.num=num;
       valueSet=true;
       notify();//release lock and then main method executes again,invokes the thread to run
    }
    public synchronized void get(){
       while(!valueSet){
           try{wait();}catch(Exception e){}

       }
        System.out.println("get " +num);
       valueSet=false;
       notify();
    }

}
class Producer implements Runnable{
    Q q;
    public Producer(Q q){
        this.q=q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class Consumer implements Runnable{
    Q q;
    public Consumer(Q q){
        this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    public void run(){

        while(true){
            q.get();
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }

}
public class InterThread {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);

    }
}
