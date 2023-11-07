import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        //print all elements of the list

        for(Integer element : arr){
            System.out.println(element);
        }


        //System.out.println(arr);


        System.out.println("---------------------------------");
        //do the above using streams

        Stream<Integer> arrStream =  arr.stream();


       //arrStream.forEach(element-> System.out.println(element));

        arr.set(0,23);


        System.out.println("---------------------------------");


        for(Integer element : arr){
            System.out.println(element);
        }

        System.out.println("---------------------------------");
       // arrStream.forEach(element-> System.out.println(element));

        //Stream sortedStreamArr = arrStream.sorted();


        //sortedStreamArr.forEach(element-> System.out.println(element));

        //arrStream.sorted().forEach(element-> System.out.println(element));

        System.out.println("---------------------------------");

        /*for(Integer element : arr){
            System.out.println(element);
        }*/

       // System.out.println(arrStream.count());


        //map filter reduce

        //map
       //Stream<Integer> newStream =  arrStream.map(element-> (2 * element));

        //newStream.forEach(element-> System.out.println(element));


        // double or sort

         arrStream.map(element-> (2 * element))
                 .sorted()
                 .forEach(element-> System.out.println(element));

    }
}