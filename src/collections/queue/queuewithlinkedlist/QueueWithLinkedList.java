package collections.queue.queuewithlinkedlist;

import java.util.*;

public class QueueWithLinkedList {
    public static void main(String[] args) {

        // LinkedList implementation of Queue
        Queue<Integer>numbers=new LinkedList<>();
        numbers.offer(1);
        numbers.offer(5);
        numbers.add(2);
        System.out.println("With LinkedList Using:"+numbers);

        int elementNumber= numbers.element();
        int peekNumber=numbers.peek();

        System.out.println("Using with element:"+elementNumber);
        System.out.println("Using with peek:"+peekNumber);

        int removeNumber=numbers.remove();
        System.out.println("Using with remove:"+removeNumber);

        System.out.println("Last Queue then remove:"+numbers);

        int pollNumber=numbers.poll();
        System.out.println("Using with poll:"+pollNumber);

        System.out.println("Last Queue:"+numbers);
    }

}
