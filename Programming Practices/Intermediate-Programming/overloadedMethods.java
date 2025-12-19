package allAboutJ;

public class overloadedMethods {
	public static void main(String[] args) {
		
		// overloaded methods - methods that share the same name but diff parameters.
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println(sum(a, b, c));
		
	}
	static int sum(int a, int b) {
		return a + b;
	}
	static int sum(int a, int b, int c) {
		return a + b + c;
	}

}
