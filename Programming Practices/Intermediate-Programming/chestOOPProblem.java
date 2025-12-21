package allAboutJ;

public class chestOOPProblem {
	String chestName = "None";
	int gold = 0;
	boolean isLocked = true;
	String keyType = "None";
	
	chestOOPProblem(String chestName) {
		this.gold = 0;
		this.isLocked = true;
		this.keyType = "None";
	}
	chestOOPProblem(String chestName, int gold) {
		this.isLocked = false;
		this.keyType = "None";
	}
	chestOOPProblem(String chestName, int gold, boolean isLocked, String keyType) {
		this.chestName = "Bounty Chest";
		this.gold = 0;
		this.isLocked = false;
		this.keyType = "None";
	}
	void openChest(String key) {
		if (key.equals(keyType) && this.isLocked == true) {
			this.isLocked = false;
			System.out.printf("Chest Unlocked! You found %d gold.\n", this.gold);
		} else {
			System.out.println("Wrong key! The chest remains locked.");
		}
		if (this.isLocked == false) {
			System.out.println("The chest is already open!");
		}
	}
	void addGold(int amount) {
		if (this.isLocked == false) {
			this.gold += 15;
		} else {
			System.out.println("Cannot add gold. The chest is locked.");
		}
	}
	void chestStatus() {
		System.out.printf("Chest: %s \nGold: %d \nLocked: %b \nKey Type: %s", this.chestName, this.gold, this.isLocked, this.keyType);
	}

}
