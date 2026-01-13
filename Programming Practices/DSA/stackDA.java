package puzzles;
import java.util.Stack;

public class stackDA {
	public static void main(String[] args) {
		
		//stack - LIFO - Last-In First-Out
		// 		  stores objects into a sort of a "vertical tower".
		//		  push() to add to the top
		// 		  pop() to remove from the top
 		
		//Uses of stacks?
		//1. undo/redo features in text editors
		//2. moving back/forward through browser history
		//3. backtracking algorithms(maze, file directories)
		//4. calling functions (call stack)
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
			
		System.out.println(stack);
	
		System.out.println(stack.empty());
		// stack.empty - checks if the value of the stack is empty (true) or not (false)
		
		String myFavNumber = stack.pop();
		//stack.pop - removes the last value of the stack.
		//			  We can also assign the popped value to a variable.	
		
		System.out.println(stack.peek());
		//stack.peek - you can look at the top most item within out stack.
		
		System.out.println(stack.search("3"));
		//stack.search - searched for the index(from the the top and it doesn't start with 0) 
		//				 of the value that you are finding.
		//				 If it can;t find the value that you are trying to find then
		//				 it will give you a negative number. 
		
		System.out.println(stack);
		System.out.println(myFavNumber);
	}
}
