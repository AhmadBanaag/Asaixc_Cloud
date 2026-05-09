package puzzles;

public class InventoryItem {
	
	private String itemName;
	private int itemQuantity;
	private static int totalItemsManaged;
	
	public InventoryItem(String itemName) {
		this.itemName = itemName;
		totalItemsManaged++;
	}
	
	public InventoryItem(String itemName, int itemQuantity) {
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		totalItemsManaged++;
	}
	
	public int getQuantity() {
		return itemQuantity;
	}
	
	public String getName() {
		return itemName;
	}
	
	public void setRestock(int restock) {
		itemQuantity += restock;
	}
	
	public static void showTotal() {
		System.out.printf("YOU STOCKED A TOTAL OF %d PRODUCTS\n", totalItemsManaged);
	}
	
	
	
}
