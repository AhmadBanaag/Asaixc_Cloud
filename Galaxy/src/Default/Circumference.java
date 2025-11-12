package Default;
import java.util.Scanner;

public class Circumference {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What's the radius of the circle? ");
		double radius = input.nextDouble();
		
		double circumference;
		double area;
		double volume;
		
		circumference = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius, 2);
		volume = (4.0/1.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.println("The circumference of the circle is " + circumference);
		System.out.println("The area of the circle is " + area);
		System.out.println("The volume of the circle is " + volume);
		
		input.close();
	}

}
