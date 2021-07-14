package collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<Integer> numbersOne=new LinkedHashSet<>();
        LinkedHashSet<Integer> numbersTwo=new LinkedHashSet<>();
        numbersOne.add(2);
        numbersOne.add(4);
        numbersOne.add(1);
        System.out.println("NumbersOne:"+numbersOne);
        numbersTwo.add(8);
        numbersTwo.add(4);
        numbersTwo.add(5);
        System.out.println("NumbersTwo:"+numbersTwo);


        boolean result=numbersOne.containsAll(numbersTwo);
        System.out.println("Subset for LinkedHashSet:"+result);


        /*

        numbersOne.addAll(numbersTwo);
        System.out.println("Union for LinkedHashSet:"+numbersOne);

         */

        /*
        numbersOne.retainAll(numbersTwo);
        System.out.println("Intersection for LinkedHashSet:"+numbersOne);
         */




    }
}
