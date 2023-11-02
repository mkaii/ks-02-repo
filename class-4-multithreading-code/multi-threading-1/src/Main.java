public class Main {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        ForExecutor ex1 = new ForExecutor("ex1");

        ex1.start();

        try {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {
            System.out.println("Mainak");
        }

        ForExecutor ex2 = new ForExecutor("ex2");

        ex2.start();

        System.out.println(Thread.currentThread());
    }
}