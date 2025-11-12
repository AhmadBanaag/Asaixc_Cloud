package Default;
import java.util.Random;

public class random {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		System.out.print("What do you want to ask? ");
		
		int dice = random.nextInt(7);
		
		if (dice==0) {
			System.out.println("Yes naman");
		} else if (dice==1) {
			System.out.println("Sorry pero wala eh, the answer is no!");
		} else if (dice==2) {
			System.out.println("Siguro? I'm not sure");
		} else if (dice==3) {
			System.out.println("I don't know, tanong mo sa pagong");
		} else if (dice==4) {
			System.out.println("What a nice question po!");
		} else {
			System.out.println("One day, it will happen.");
		}
	}
}
