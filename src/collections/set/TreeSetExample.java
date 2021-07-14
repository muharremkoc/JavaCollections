package collections.set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        System.out.println(numbers);

        /*
         System.out.print("subSet not using boolean:");
        System.out.println(numbers.subSet(3,5));
        System.out.print("subSet using boolean:");
        System.out.println(numbers.subSet(3, false,
                5,true));
         */



            /*
                  System.out.print("Headset not using boolean:");
        System.out.println(numbers.headSet(3));
        System.out.print("Headset using boolean:");
        System.out.println(numbers.headSet(3,true));
             */




        /*
                int pollFirst=numbers.pollFirst();
        int pollLast=numbers.pollLast();
        System.out.println("Polled First Element:"+pollFirst);
        System.out.println("Polled Last Element:"+pollLast);
        System.out.println("Last Tree:"+numbers);
         */




        /*
               System.out.println("Higher:"+numbers.higher(3));
         System.out.println("Lower:"+numbers.lower(4));
        System.out.println("Ceiling:"+numbers.ceiling(2));
        System.out.println("Floor:"+numbers.floor(4));
         */


        /*
        int first=numbers.first();
        System.out.println("TreeSet'S first element:"+first);

        int last=numbers.last();
        System.out.println("TreeSet'S last element:"+last);

         */


        /*
         System.out.println("Remove method for TreeSet");
         numbers.remove(4);
        System.out.println(numbers);
         */

    }
}
