package puzzles;

public class carMain {
	public static void main(String[] args) {
		
		car car1 = new car("Ford");
		car car2 = new car("Kia");
		
		car1.accelerate();
		car2.accelerate(50);
		car1.accelerate();
		car2.accelerate(50);
		
		double speedCheck = car1.getCurrentSpeed();
		
		System.out.println(speedCheck);
		
		car.showTotalCars();
		
		
	}

}
