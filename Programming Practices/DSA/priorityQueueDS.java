package puzzles;
import java.util.*;

public class priorityQueueDS {
	public static void main(String[] args) {
		
		//Priority Queue - A FIFO data structure that serves elements
		//				   with the highest priorities first.
		//				   depending on the data type
		
		Queue<String> q = new PriorityQueue<>(Collections.reverseOrder());
		
		//Collections.reverseOrder() - reverse the priority for each objects.
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		//displays then removes the objects
		
		
	}

}
