package Default;
import java.util.Arrays;

public class twoDArray {
	public static void main(String[] args) {
		
		//2D Arrays = an array where each element is an array
		
		char[][] phone = {{'1', '2', '3',},
						  {'4', '5', '6',},
						  {'7', '8', '9',},
						  {'*', '0', '#' }};
		
		for(char[] rows : phone) {
			for(char choices : rows) {
				System.out.print(choices + " ");
			}
			System.out.println();				
		}
	}
}
