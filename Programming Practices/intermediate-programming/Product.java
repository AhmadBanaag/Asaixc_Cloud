package puzzles;

public class Product {
	private String brandName;
	private String productName;
	private double weight;
	private int calories;
	
	private static int productCount;
	
	public Product(){
		productCount++;
	}
	
	public Product(String brandName, String productName, double weight, int calories){
		this.brandName = brandName;
		this.productName = productName;
		this.weight = weight;
		this.calories = calories;
		productCount++;
	}
	
	public String getProductName(String productName) {
		return productName;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void displayTotalProducts() {
		System.out.println(productCount);
	}
	
}
