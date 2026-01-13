package puzzles;
import java.util.*;

public class linkedListDS {
	public static void main(String[] args) {
		
		//Linked List - data are not in a contiguous block of memory
		//				but rather, they have their own block of memory 
		//				or address that points to the next node.
		//				Like following a bunch of clues to find the treasure.
		//				This if called a singly linked list, it can only go one way
		//				While a doubly linked list, uses more memory but it can traverse from head to tail
		//				to tail to head.
		
		// In linked list, it stored node in 2 parts(data + address)
		
		// Used of Linked List?
		// 1. Dynamic Data structure 
		// 2. Insertion and Deletion of Nodes is Easy
		// No memory wasted
		
		LinkedList<String> links = new LinkedList<String>();
		
		//NOTE: we can treat linked lists as a stack or a queue.
		
		/*
		STACK
		links.push("a");
		links.push("b");
		links.push("c");
		links.push("d");
		links.push("e");
		links.pop(); 
		//LIFO when we print stacks here, the last objects becomes the first
		
		QUEUE	
		links.offer("a");
		links.offer("b");
		links.offer("c");
		links.offer("d");
		*/
		//FIFO when we print queue here, the last objects becomes the last.
		
		links.offer("A");
		links.offer("B");
		links.offer("C");
		links.offer("D");
		
		System.out.println(links);
		
		//Adds the word "Hello" to the 3rd positions and pushing the objects to the right
		links.add(3, "Hello");
		System.out.println(links);
		
		//Removes the word "Hello" and going back to the original position
		links.remove("Hello");
		System.out.println(links);
		
		//Prints out the index of the object that we are looking for
		System.out.println(links.indexOf("C"));
		
		//Prints out the first object in the linked list
		System.out.println(links.peekFirst());
		
		//Prints out the last object in the linked list
		System.out.println(links.peekLast());
		
		//Adds an object to the first index of the linked list
		links.addFirst("0");
		
		//Adds an object to the last index of the linked list
		links.addLast("1");
		
		//Removes the object in the first index of the linked list and assigned the value to a variable
		String first = links.removeFirst();
		
		//Removes the object in the last index of the linked list and assigned the value to a variable
		String last = links.removeLast();
		
		System.out.println(first);
		System.out.println(last);
		
		System.out.println(links);
	}
}
