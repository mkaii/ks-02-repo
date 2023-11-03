public class Main {

    private static int counter = 0;

    private static synchronized void incrementCounter() {
        // The synchronized keyword on the method ensures safe access to the counter
        counter++;
    }


    public static void main(String[] args) {

        // Create two threads
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final Counter Value: " + counter);
    }


    }
