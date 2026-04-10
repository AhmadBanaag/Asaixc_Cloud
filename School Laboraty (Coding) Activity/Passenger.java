package allAboutJ.writingAndReading;
import javax.swing.JOptionPane;
import java.io.FileWriter;

public class Passenger {
	public static void main(String[] args) {
		
	try {
		
		FileWriter print = new FileWriter("C:\\Users\\Ahmad Banaag\\OneDrive\\Documents\\textFiles\\PassengerSave.txt", true);
		int input = 0;
		
	do { 
		
		input = Integer.parseInt(JOptionPane.showInputDialog(
				null,
				"WHAT VEHICLE OBJECT DO YOU WANT CREATE?\n[1] VEHICLE\n[2] TAXI\n[3] EXIT",
				"Trip To USM",
				1));
		
		int again = 2;
	
	switch(input) {
		case 1: // VEHICLE
			Vehicle vehicle = new Vehicle();
			
			vehicle.setManufacturer(null);
			vehicle.setModel(null);
			vehicle.setPlateNumber(null);
			vehicle.setPassengerLimit(0);
			
			JOptionPane.showMessageDialog(
					null,
					" -------------VEHICLE-------------- \n" +
					vehicle.TripTicket() + 
					"\n -------------------------------- ",
					"Trip to USM",
					1);
			
			print.write("\n\n----------------VEHICLE--------------------\n" + vehicle.TripTicket() + "\n---------------------------");
			print.flush();
			
			again = Integer.parseInt(JOptionPane.showInputDialog(
					null,
					"DO YOU WANT TO ADD ANOTHER OBJECT?\n[1] YES\n[2] NO",
					"Trip To USM",
					3));
			break;
		case 2: // TAXI
			Taxi taxi = new Taxi();
			
			taxi.setManufacturer(null);
			taxi.setModel(null);
			taxi.setPlateNumber(null);
			taxi.setPassengerLimit(0);
			taxi.setOperatorName(null);
			taxi.setTaxiType(0);
			taxi.setNumOfPassengers(0);
			taxi.setDistanceTraveled(0);
			taxi.calculateFare();
			
			JOptionPane.showMessageDialog(
					null,
					" -------------TAXI-------------- \n" +
					taxi.TripTicket() + 
					"\n ----------------------------- ",
					"Trip to USM",
					1);
			
			print.write("\n\n----------------TAXI--------------------\n" + taxi.TripTicket() + "\n---------------------------");
			print.flush();
			
			again = Integer.parseInt(JOptionPane.showInputDialog(
					null,
					"DO YOU WANT TO ADD ANOTHER OBJECT?\n[1] YES\n[2] NO",
					"Trip To USM",
					3));
			break;
		case 3: // EXIT
			break;
		default: // USER INPUT NOT AVAILABLE
			JOptionPane.showMessageDialog(
					null,
					"OBJECT NOT AVAILABLE!\nPLEASE TRY AGAIN!",
					"ERROR",
					0);
	
	}
		// Loops when the user wants to try again
		if (again == 2) {
			input = 3;
		}
	
	} while (input != 3);
	
	print.close();
	JOptionPane.showMessageDialog(
			null,
			"THANK YOU FOR USING OUR SYSTEM!",
			"Trip To USM",
			1);
	
	
	} catch (Exception e) {
		JOptionPane.showMessageDialog(
				null,
				e.getMessage(),
				"ERROR",
				0);
		}	
	} 
}
