import java.util.Arrays;
import java.util.PriorityQueue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Parent p2 = new Child();
        //p2.run();

        Parent p2 = new Parent()
        {
            @Override
            public void run()
            {
                System.out.println("I am Child");
            }

        };


       p2.run();

       IParentTest p1 = new IParentTest() {

           @Override
           public void sum(int a, int b, int c) {
               System.out.println(a+b+c);
           }
       };

        p1.sum(1,2,3);

        IParentTest p3 = (int a, int b , int c)->{
            System.out.println("inside lambda method");
            System.out.println(a+b+c);
        };

        //it gave me a child class of IParentTest whose sum method prints 2 lines
        //System.out.println("inside lambda method");
        //System.out.println(a+b+c);

        p3.sum(2,3,4);

        IParentTest p4 = (a, b ,c)-> System.out.println(a+b+c);

        p4.sum(5,5,5);

        IProduct prod = (a,b,c)-> a*b*c;


        System.out.println(prod.product(2,3,4));

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> a-b);

        Integer [] arr = new Integer[5];

        Arrays.sort(arr,
                (a,b)-> a-b
        );



    }
}