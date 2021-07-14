package collections.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
       HashSet<Integer> numbersOne=new HashSet<>();
        HashSet<Integer> numbersTwo=new HashSet<>();
        numbersOne.add(14);
        numbersOne.add(32);
        numbersOne.add(1);
        numbersOne.add(4);
        numbersOne.add(70);
        System.out.println("NumberOne:"+numbersOne);
        numbersTwo.add(6);
        numbersTwo.add(4);
        numbersTwo.add(5);
        System.out.println("NumbersTwo:"+numbersTwo);

        /*

        numbersOne.addAll(numbersTwo);
        System.out.println("Union:"+numbersOne);

         */


                numbersOne.retainAll(numbersTwo);
        System.out.println("Intersection:"+numbersOne);

        /*
                numbersOne.removeAll(numbersTwo);
        System.out.println("Difference:"+numbersOne);
         */

    //  System.out.println("Subset:"+numbersOne.containsAll(numbersTwo));



    }
}
