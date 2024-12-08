package MultiThreading;

public class Practice {


        public static void main(String[] args) {
            // Create thread to print even numbers
            Thread evenThread = new Thread(new EvenNumberRunnable());
            // Create thread to print odd numbers
            Thread oddThread = new Thread(new OddNumberRunnable());

            // Start both threads
            evenThread.start();
            oddThread.start();

            // Wait for both threads to finish
            try {
                evenThread.join();
                oddThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Runnable for printing even numbers
    class EvenNumberRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100); // Adding sleep to simulate time taken for computation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Runnable for printing odd numbers
    class OddNumberRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 19; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100); // Adding sleep to simulate time taken for computation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }





