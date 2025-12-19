package allAboutJ;

public class methods {
	public static void main(String[] args) {
		
		//Variables in one method is not familiar with another method. 
		
		String name = "Ahmad";
		int age = 18;
		
		happyBirthday(name, age);
		
		//====================================
		
		int number1 = 20, number2 = 30;
		
		System.out.println(sum(number1, number2));
		
		//====================================
		
		String first = "Ahmad";
		String last = "Banaag";
		
		System.out.println(getFullName(first, last));
		
		//====================================
		
		int age1 = 19;
		
		if (checkAge(age1)) {
			System.out.println("You are 18 years old or older!");
		} else {
			System.out.println("You must be 18 years old or older!");
		}
	}
	static void happyBirthday(String name, int age) {
		System.out.printf("Hi %s! You are now %d years old\n", name, age);
	}
	static int sum(int number1, int number2) {
		return number1 + number2;
	}
	static String getFullName(String first, String last) {
		return first + " " + last;
	}
	static boolean checkAge(int age1) {
		if (age1 >= 18) {
			return true;
		} else {
			return false;
		}
	}
}
