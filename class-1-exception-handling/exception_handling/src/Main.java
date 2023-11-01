// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void f2()
    {

        System.out.println("Learning Exception handling-start f2");

        String s = null;

        s.length();

        System.out.println("Learning Exception handling-end f2");
    }

    public static void f1()
    {
        System.out.println("Learning Exception handling-start f1");

        f2();

        System.out.println("Learning Exception handling-end f1");
    }

    public static void main(String[] args) {


        System.out.println("Learning Exception handling-start!!!");

        f1();
        //int[] arr = new int[5];

        System.out.println("testing code");

        //arr[10] = 1; //exception happened here


        System.out.println("Learning Exception handling-end!!!");
    }
}