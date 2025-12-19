package allAboutJ;

public class varArgsPractice {
	public static void main(String[] args) {
		
		System.out.println(multihitAttack(5, 2, 3, 1));
		System.out.println(multihitAttack(10, 5));
		System.out.println(multihitAttack(10, 6));
		System.out.println(multihitAttack(7));
		
	}
	static String multihitAttack(int baseDamage, int... hits) {
		
		int totalDamage = 0;
		String msg = ""; 
		
		 for (int i = 0; i < hits.length; i++) {

	            int hitDamage = baseDamage + hits[i];

	            if (hits[i] >= 5) {
	                hitDamage *= 2;
	                msg += "Critical Hit!\n";
	            }
	            
	            msg += "Hit " + (i + 1) + " dealt " + hitDamage + " damage.\n";
	            totalDamage += hitDamage;
	        }
	        return msg + "Total Damage: " + totalDamage + "\n";
	    }
	}