package Default;

public class array {
	public static void main(String[] args) {
		
		
		/*
		 * int[] numbers = {1, 3, 4, 5}
		 * 
		 * System.out.println(Arrays.toString(numbers));
		 * 
		 *This creates an array but with only one-dimension.
		 * */
		
		/*int[][] numbers = {{1, 2, 3}, 
							 {4, 5, 6}};*/
		
		//System.out.println(Arrays.deepToString(numbers)); //Used for multi-dimension arrays
		
		int[] arr = {1, 2, 3, 4, 5, 6, 8};
		
		int result = 0;
		
		for(int n: arr) {
			result ^= n;
			
		}
		System.out.println(result);
	}

}
