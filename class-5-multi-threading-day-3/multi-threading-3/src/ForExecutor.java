public class ForExecutor implements Runnable{

    private String name;

    public ForExecutor(String name) {
        this.name = name;
    }

    public void print()
    {
        for(int i=0;i<10;i++) {
            System.out.println(Thread.currentThread() + name + " " + i);

        }
    }

    @Override
    public void run() {
       print();
    }
}
