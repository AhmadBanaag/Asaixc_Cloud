package allAboutJ;

public class varArgs {
	public static void main(String[] args) {
		
		//Variable Arguments = allow a method to accept a varying # of args.
		//... (Ellipsis)
		
		add(1, 2, 3, 4, 5);
		
	}
	static void add(int... numbers) {
		
		int sum = 0;
		
		for(int number : numbers) {
			 sum += number;
		}
		
		System.out.println(sum);
	}

}
