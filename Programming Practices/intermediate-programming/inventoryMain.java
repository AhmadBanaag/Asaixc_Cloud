package puzzles;

public class inventoryMain {
	public static void main(String[] args) {
		
		InventoryItem.showTotal(); 

	    // 2. Create items (Instantiation & Overloading)
	    InventoryItem item1 = new InventoryItem("Milo", 22);
	    InventoryItem item2 = new InventoryItem("Waffle Deluxe");

	    // 3. Update stock (Mutator)
	    item2.setRestock(10); 

	    // 4. Show individual status (Accessor)
	    System.out.println(item1.getName() + " Quantity: " + item1.getQuantity());
	    System.out.println(item2.getName() + " Quantity: " + item2.getQuantity());

	    // 5. Show final master count (Static)
	    InventoryItem.showTotal();
		
	}

}
