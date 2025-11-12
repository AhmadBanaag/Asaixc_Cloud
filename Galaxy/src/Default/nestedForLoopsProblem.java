package Default;

public class nestedForLoopsProblem {
	public static void main(String[] args) {
		        // Outer loop for rows (1 to 10)
		        for (int i = 1; i <= 10; i++) {
		            // Inner loop for columns (1 to 5)
		            for (int j = 1; j <= 5; j++) {
		                System.out.print(j + " x " + i + " = " + (j * i) + "\t");
		            }
		            System.out.println(); // move to next line after each row
		        }
	}

}
