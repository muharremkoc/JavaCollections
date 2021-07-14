package collections.queue.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeForQueue {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque= new ArrayDeque<>();
        arrayDeque.offerFirst(1);
        arrayDeque.offer(5);
        arrayDeque.add(10);
        arrayDeque.offerLast(2);
        System.out.println(arrayDeque);

        int peekFirst=arrayDeque.peekFirst();
        int peekLast=arrayDeque.peekLast();

        System.out.println("Working with PeekFirst:"+peekFirst);
        System.out.println("Working with PeekLast:"+peekLast);

        int pollFirst=arrayDeque.pollFirst();
        int pollLast=arrayDeque.pollLast();

        System.out.println("Removing First Element:"+pollFirst);
        System.out.println("Removing Last Element:"+pollLast);

        System.out.println("Last ArrayDeque:"+arrayDeque);


    }
}
