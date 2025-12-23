package allAboutJ;
import java.util.Scanner;

public class employeeTimeInSystemProblem {
	 public static void main(String[] args) {
		 	
		 	Scanner input = new Scanner(System.in);
		 	
		 	System.out.print("Enter Employee's Name: ");
		 	String name = input.nextLine();
		 	
		 	System.out.printf("Welcome Mr/Ms. %s!", name);
		 	
		 	System.out.print("\nEnter ID: ");
		 	String ID = input.nextLine();
		 
	        employeeTimeInSystemSolving systemAction = new employeeTimeInSystemSolving(name, ID);
	        
	        boolean bye = true;
	        
	        do {
	        System.out.print("\nWhat to do? \n[1] Time-in \n[2] Time-out \n[3] Check Status? \n[4] Done \nAction: ");
	        int action = input.nextInt();
	        
	        switch (action) {
	        case 1:
	        	systemAction.timeIn(); 	  
	        	break;
	        case 2:
	        	systemAction.timeOut();
	        	break;
	        case 3:
	        	systemAction.employStatus();
	        	break;
	        case 4:
	        	bye = false;
	        	break;
	        default:	
	        	System.out.println("Invalid Action, PLEASE TRY AGAIN!");
	        } 
	        
	        } while(bye);
	        
	        System.out.println("\nHave a nice day!");	 
	        input.close();
	  }
}


