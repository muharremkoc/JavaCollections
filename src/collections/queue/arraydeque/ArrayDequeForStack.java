package collections.queue.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeForStack {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque= new ArrayDeque<>();
        arrayDeque.push(1);
        arrayDeque.push(5);
        arrayDeque.push(10);
        arrayDeque.push(2);
        System.out.println(arrayDeque);

        int peekStack=arrayDeque.peek();

        System.out.println("Working with PeekStack:"+peekStack);

        while (!arrayDeque.isEmpty()){
            System.out.println("Remove For Stack Element:"+arrayDeque.pop());
        }

    }
}
