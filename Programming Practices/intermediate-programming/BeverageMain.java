package puzzles;

import java.util.ArrayList;

public class BeverageMain {
	public static void main(String[] args) {
		
		ArrayList<Beverage> beverage = new ArrayList<>();
		AlcoholicBeverage alcohol = new AlcoholicBeverage("TANDUAY", "SELECT", "VODKA BOTTLE", 3.0, 11);
		
		beverage.add(new AlcoholicBeverage("TANDUAY", "SELECT", "VODKA BOTTLE", 3.0, 11));
		beverage.add(new Beverage("LE MINERALE", "WATER", "BOTTLE", 21.0));
		beverage.add(new SoftDrink("COCA-COLA", "ZERO", "PLASTIC BOTTLE", 15.0, 30));
		
		for (Beverage b : beverage) {
			System.out.println(b.displayAll());
		}
		
		System.out.println(alcohol.displayAll());
	}

}
