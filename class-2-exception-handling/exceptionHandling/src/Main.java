import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void f(int x)
    {
        System.out.println(x);
    }
    public static void main(String[] args) {



        String s = null;
        System.out.println("exception handling......");

        //int x = 10/0;

       //throw new ArithmeticException();


       //exception handling

       /* try {

            int x = 10 / 0; //catch(arithmetic)
            s.length();//null , arithmetic , index

            System.out.println("middleman");


        }
        catch(Exception ex)
        {

            System.out.println(ex.toString());
            System.out.println("Mainak");
        }*/


        try {

            int x = 10 / 0; //catch(arithmetic)
           //s.length();//null , arithmetic , index
            //int x = 10 / 0; //catch(arithmetic)


            System.out.println("middleman");


        }
        catch(NullPointerException ex1)
        {

            System.out.println(ex1.toString());
            System.out.println("Mainak");
        }
        catch(ArrayIndexOutOfBoundsException ex2)
        {

            System.out.println(ex2.toString());
            System.out.println("abcd");
        }
        finally{
            System.out.println("I am in finally");
            f(5);
        }


        System.out.println("exception handling......end");


        ArrayList<String> arr1 = new ArrayList<>();

        List<String> arr2 = new ArrayList<>();



    }
}