package main;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 50; i > 0; i--) {
            queue.add(i);
        }
        System.out.println(Arrays.deepToString(queue.toArray()));

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
