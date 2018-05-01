package presentation;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_sample {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int i=0;i<100;i++) queue.add(i);
        while(true){
            Integer a = queue.poll();
            if (a == null) break;
            System.out.print(a + " ");
        }
        System.out.println("");

	}

}
