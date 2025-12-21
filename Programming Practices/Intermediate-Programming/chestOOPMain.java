package allAboutJ;

public class chestOOPMain {
	  public static void main(String[] args) {

	        chestOOPProblem c1 = new chestOOPProblem("Ancient Chest");
	        chestOOPProblem c2 = new chestOOPProblem("Silver Chest", 100);
	        chestOOPProblem c3 = new chestOOPProblem("Dragon Chest", 500, true, "DragonKey");

	        c1.openChest("None");
	        c2.addGold(50);
	        c3.openChest("WoodKey");
	        c3.openChest("DragonKey");

	        c3.chestStatus();
	}

}
