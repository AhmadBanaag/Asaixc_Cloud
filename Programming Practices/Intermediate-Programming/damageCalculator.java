package allAboutJ;
import java.util.Scanner;

public class damageCalculator {
	public static void main(String[] args) {
		
		System.out.println(updateHealth(100));
		System.out.println(updateHealth(100, 30));
		System.out.println(updateHealth(70, 20, true));
		System.out.println(updateHealth(70, 20, false));
		System.out.println(updateHealth(80, 25, 10));
	
		
	}
	static String updateHealth(int currentHealth) {
		return "Current Health: " + currentHealth;
	}
	static String updateHealth(int currentHealth, int damage) {
		int Health = currentHealth - damage;
		return "You took " + damage + " damage\n" + "Current Health: " + Health; 
	}
	static String updateHealth(int currentHealth, int heal, boolean isPotion) {
		if (isPotion) {
			int addHeal = currentHealth + heal;
			return "You healed " + heal + " HP\n" + "Currenth Health: " + addHeal;
		} else {
			return "Healing Failed\n" + "Current Health " + currentHealth;
		}
	}
	static String updateHealth(int currentHealth, int damage, int defense) {
		
		int blocked = defense;
		int finalDamage = damage - defense;
		
		if (finalDamage < 0) {
			finalDamage = 0;
			blocked = damage;
		}
		
		int health = currentHealth - finalDamage;
		
		if(health < 0) health = 0;
		
		return "Defense blocked " + blocked + " damage.\n" +
        "You took " + finalDamage + " damage.\n" +
        "Current Health: " + health;
	}
}
