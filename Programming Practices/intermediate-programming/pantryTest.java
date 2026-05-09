package puzzles;

public class pantryTest {
	public static void main(String[] args) {
		
		Product prod1 = new Product();
		Product prod2 = new Product("Nestle", "Milo", 22, 90);
		
		prod1.displayTotalProducts();
		prod2.displayTotalProducts();
		
	}

}
