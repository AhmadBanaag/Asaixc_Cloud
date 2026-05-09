package puzzles;

public class car {
			
	private String model;
	private double currentSpeed;
	private static int carCount;
	
	public car(String model) {
		this.model = model;
		currentSpeed = 0;
		carCount++;
	}
	
	public void  accelerate() {
		currentSpeed += 10;
		System.out.println(model + " Accelerated for " + currentSpeed + " kph");
	}
	
	public void accelerate(double increment) {
		currentSpeed += increment;
		System.out.println(model + " Accelerated for " + currentSpeed + " kph");
	}
	
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	public static void showTotalCars() {
		System.out.printf("There are %d cars.", carCount);
	}
	
	
}
