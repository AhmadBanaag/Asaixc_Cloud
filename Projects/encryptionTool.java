package Default;
import java.util.Scanner;

public class encryptionTool {
	public static void main(String[] args) {
		
	 Scanner input = new Scanner (System.in);
     
	   char opt = ' ';
	   String encrypted = "";
	   boolean isEncryptedValid = false;	
	   char[] array = new char [encrypted.length()];
	      
	   do {
		   do {
	   isEncryptedValid = false;
	   System.out.print("Encrypted: ");
	   encrypted = input.nextLine();
	   
	   array = new char [encrypted.length()]; //test! == encrypted.length = 5
	   
	   for(int i = 0; i < encrypted.length(); i++) {
		   array[i] = encrypted.charAt(i); //{t, e, s, t, !}
		   
		   if (array[i] == '!' || array[i] == ' ' || array[i] == '$' || array[i] == '^' ) {
			   isEncryptedValid = true;
		   }
	   }
	   
	   if (isEncryptedValid) {
		   System.out.println("INVALID INPUT!");
	   } } while (isEncryptedValid);	  
		   
	 for(int i = 0; i < encrypted.length(); i++) {
		   array[i] = encrypted.charAt(i);
		}
	   
	   System.out.print("Key: ");
	   String key = input.nextLine();
	   int keyLength = key.length();
	      
	   if ((keyLength % 2) == 1) {
		   if (key.equals(encrypted)) {
	        	 System.out.println("\nRetreat. Home.");
		   } else {
		   System.out.print("\nDeciphered: ");
		   
		   for (int i = encrypted.length()-1; i>0; i--) {
	         if (array[i] == ('a') || array[i] == ('e') || array[i] == ('i')) {
	         
	         } else {
	            System.out.print(array[i]);
	            }
	         }
		   }
	         
	       } else if ((keyLength % 2) == 0){
	    	   if (key.equals(encrypted)) {
		        	 System.out.println("\nRetreat. Home.");
		     } else {
		    	 
		    	 System.out.print("\nDeciphered: ");
		    	 
		        	for (int i = 0; i<encrypted.length(); i++) {
	            if (array[i] == ('o')) System.out.print('r');
	            else if (array[i] == ('u')) System.out.print('v');
	            else System.out.print(array[i]);       
	         } 
		    }
	       }
		
	         System.out.print("\n\nInput again? [y/n]: ");
	         opt = input.next().charAt(0);
	         
	         input.nextLine();
	         
	      } while (opt == 'y' || opt == 'Y'); 
	   input.close();
	   }
	}