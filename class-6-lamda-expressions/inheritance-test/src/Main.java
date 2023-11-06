import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        p1.run();

        Child c1 = new Child();
        c1.run();

        //c1.printx();

        Parent p2 = new Child();
        p2.run();


        List<String> arr = new LinkedList<>();

        arr.add("Mainak");
        arr.add("Santosh");

        System.out.println(arr);

        //

    }
}