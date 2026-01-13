package puzzles;
import java.util.LinkedList;
import java.util.Queue;

public class queueDA {
	public static void main(String[] args) {
		
		
		//Queue - FIFO First-in First-out (ex. when filling in line, first come - first serve)
		// 		  A collection designed for holding elements prior to processing
		//		  Linear Data Structure
		
		//		  add			enqueue, offer()
		//		  remove		dequeue, poll()
		//		  look			searching, peek()
		
		// Where are queues useful?
		//	1. Keyboard Buffer
		//	2. Printer Queue
		//	3. Used in LinkedList, PriorityQueues, Breadth-first search
		
		Queue<String> q = new  LinkedList<String>();
		
		// Queue - is an interface and we can't make an instance for an interface.
		//		   We will be needing a class to implement Queue which are the LinkedList or PriotrityQueue
		
		
		System.out.println(q.isEmpty());
		//q.isEmpty() - checks if the queue is empty
		
		System.out.println(q.size());
		//q.size() - counts how many objects are there in a queue
		
		q.offer("a");
		q.offer("b");
		q.offer("c");
		q.offer("d");
		
		System.out.println(q);
		
		System.out.println(q.contains("c"));
		//q.contains() - checks if the object is in the queue
		
		q.poll();
		System.out.println(q);
		
		System.out.println(q.peek());
	
	}

}
