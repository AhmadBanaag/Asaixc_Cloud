package Default;

public class stringMethod {
	public static void main(String[] args) {
		
		String name = "Jonathan Groffa";
		
		int laba = name.length();
		char letter = name.charAt(2);
		int asa = name.indexOf('a');
		int asa1 = name.lastIndexOf('a');
		String dagko = name.toUpperCase();
		String islan = name.replace('a', 'u');
		
		System.out.println(
				"Ang kalabaon kay: " + 
				 laba + 
				 "\nLetra kay: " + 
				 letter + 
				 "\n" + 
				 asa + 
				 "\n" + 
				 asa1 +
				 "\n" +
				 dagko +
				 "\n" +
				 islan
				 );
		
		String name1 = "Boy et";
		
		if(name1.isEmpty()) {
			System.out.println("Wala man lagi unod?");
		}
		else {
			System.out.println("Napaka-angas mo naman " + name);
		}
		
		if(name1.contains(" ")) {
			System.out.println("May space megs");
		}
		else {
			System.out.println("Payts ah");
		}
		
	
	}
}
