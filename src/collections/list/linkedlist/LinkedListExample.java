package collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbersTwo=new LinkedList<>();
        //Index places
        numbersTwo.add(4);
        numbersTwo.add(5);
        numbersTwo.add(6);
        //Places the specified Index
        numbersTwo.add(3,7);
        System.out.println("LinkedList:"+numbersTwo);
        int numberTwoRemove=numbersTwo.remove(1);
        System.out.println("Removing Element for LinkedList:"+numberTwoRemove);
        System.out.println("After Remove for LinkedList"+numbersTwo);
        numbersTwo.set(1,8);
        System.out.println("After Set for LinkedList:"+numbersTwo);
        int numberTwo=numbersTwo.get(2);
        System.out.println("Choosing Element for LinkedList:"+numberTwo);


    }
}
