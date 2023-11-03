public class Main {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread());


        ForExecutor ex1 = new ForExecutor("ex1");




        Thread t1 = new Thread(ex1);
        t1.start();


        ForExecutor ex2 = new ForExecutor("ex2");

        Thread t2  = new Thread(ex2);
        t2.start();

       /* try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            System.out.println("error");
        }*/

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("error");
        }




        System.out.println(Thread.currentThread());
    }
}