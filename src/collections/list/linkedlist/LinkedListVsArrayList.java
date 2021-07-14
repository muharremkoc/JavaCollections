package collections.list.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
      List<Integer> numbersOne=new ArrayList<>();

        System.out.println("For ArrayList:");
      numbersOne.add(1);
        numbersOne.add(2);
        numbersOne.add(3);

        System.out.println("ArrayList:"+numbersOne);

        int numberOne=numbersOne.get(2);
        System.out.println("Choosing Element for ArrayList:"+numberOne);
        int numberOneRemove=numbersOne.remove(1);
        System.out.println("Removing Element:"+numberOneRemove);
        System.out.println("Lasted to Removing:"+numbersOne);
        System.out.println("IsEmpty:");

    }
}
