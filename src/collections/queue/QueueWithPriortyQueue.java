package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWithPriortyQueue {
    public static void main(String[] args) {
        Queue<Integer> priortyQueue=new PriorityQueue<>();
        priortyQueue.offer(2);
        priortyQueue.offer(1);
        priortyQueue.offer(5);
        priortyQueue.offer(4);
        while (!priortyQueue.isEmpty()){
            System.out.println("Element is Polling:"+priortyQueue.poll());
        }
    }
}
