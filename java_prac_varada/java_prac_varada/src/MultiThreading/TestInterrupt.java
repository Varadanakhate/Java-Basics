package MultiThreading;

public class TestInterrupt extends Thread {
    public void run(){
//give false output if interrupted ot there
        System.out.println("A:" +Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        // this will throw exception after going into sleep state as it does not change state like above from true to false it will stay true only
        try{
            for (int i = 0; i <5 ; i++) {
                System.out.println(i);
                System.out.println("B: "+Thread.interrupted());
                Thread.sleep(1000);

            }
        }
        catch (Exception e){
            System.out.println("thread interrupted "+e);
        }
    }

    public static void main(String[] args) {

        TestInterrupt t4 = new TestInterrupt();

        t4.start();
        t4.interrupt();



    }


}

