import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(139);
        arr.add(21);
        arr.add(36);
        arr.add(48);

        //print all elements of the list

        for(Integer element : arr){
            System.out.print(element + " ");
        }


        //System.out.println(arr);


        System.out.println("\n---------------------------------");

        Stream<Integer> arrStream =  arr.stream();


        //arrStream.forEach(x-> System.out.print(x + " "));

        //map :

        /* Stream<Integer> newStream  =  arrStream.map(x->50 + x);

        newStream.forEach(x-> System.out.print(x + " "));*/


        //arrStream.map(x->50 + x).forEach(x-> System.out.print(x + " "));

        // print the triple values in sorted way


       /* arrStream.map(num->num*3)
                .sorted()
                    .forEach(tripledValue-> System.out.print(tripledValue  + " "));*/

        arrStream.sorted()
                .map(num->num*3)
                .forEach(tripledValue-> System.out.print(tripledValue  + " "));


        System.out.println("\n---------------------------------\n");

        //filter

        for(Integer element : arr){
            if(element%2==0)
             System.out.print(element + " ");
        }

        System.out.println("\n---------------------------------\n");

        Stream<Integer> arrStream2 =  arr.stream();

        arrStream2.filter(x->x%2==0).
                forEach(x-> System.out.print(x  + " "));

        System.out.println("\n---------------------------------\n");


        //print  cube of only those numbers which are odd

        arr.stream().
                filter(x->x%2!=0).
                    map(x->x*x*x).
                        forEach(x-> System.out.print(x  + " "));



        System.out.println("\n---------------------------------\n");

        //reduce

      /*  Integer sum = 0;

        for(Integer num : arr)
        {
            sum = sum + num;
        }



        System.out.println(sum);*/

        System.out.println("\n---------------------------------\n");



        Integer streamSum = arr.stream().
                reduce(0,(sum,x)->sum + x);

        System.out.println(streamSum);


        System.out.println("\n---------------------------------\n");


        Integer streamProduct  = arr.stream().
                reduce(1,(prod,x)->prod *x);

        System.out.println(streamProduct);

        //homework : use reduce method of steam to find out the max or min of an arraylist

        //collect

        System.out.println("\n---------------------------------\n");

        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);



    }
}