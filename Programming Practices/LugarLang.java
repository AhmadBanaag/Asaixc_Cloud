package Default;
import javax.swing.JOptionPane;

public class LugarLang {
	public static void main(String[] args) {
		
		double cost = 0, route_cost, pay, change;
		String loc;
		
			//Intro to Passengers
		JOptionPane.showMessageDialog(
				null, 
				"Welcome to Kabacan!", 
				"Kabacan Express", 
				JOptionPane.PLAIN_MESSAGE
			);
		
			//Name
		String name = JOptionPane.showInputDialog(
				null, 
				"Enter Name: ", 
				"Name of Passenger", 
				JOptionPane.PLAIN_MESSAGE
			);
			
			if (name.isEmpty()) {
				JOptionPane.showMessageDialog(
						null,
						"Error: Try Again", 
						"ERROR", 
						JOptionPane.PLAIN_MESSAGE);
				return;
			
			}
	
			// Type of Passenger
		double passengerType = Double.parseDouble(JOptionPane.showInputDialog(
				null, 
				"\nWelcome " +
				name +
				"!" +
				"\nType of Passenger:" +
				"\n[1] Senior Citizen (15%)" + 
				"\n[2] PWD (10%)" + 
				"\n[3] Regular",
				"PASSENGE TYPE",
				JOptionPane.PLAIN_MESSAGE
			));
				
				// Discount for a specific passenger type
				if (passengerType==1) {
					passengerType = 0.15;
				}
				else if (passengerType==2) {
					passengerType = 0.1;
				}
				else if (passengerType==3) {
					passengerType = 1.0;
				}
				else {
					JOptionPane.showMessageDialog(
							null, 
							"Error: Try Again", 
							"ERROR", 
							JOptionPane.PLAIN_MESSAGE);
					return;
				}
				
		
		int route = Integer.parseInt(JOptionPane.showInputDialog(
				null, 
				"Where to go?" +
				"\n[1] Kidapawan - 30 Php" +
				"\n[2] Midsayap - 40 Php",
				"Payment Method",
				JOptionPane.PLAIN_MESSAGE
			));
		
				if (route==1) {
					loc = "Kidapawan = 30 Php";
					route_cost = 30;
					
				}
				else {
					loc = "Midsayap = 40 Php";
					route_cost = 40;
				}
		
		JOptionPane.showMessageDialog(
				null, 
				"Going to: " +
				loc,
				"Route",
				JOptionPane.PLAIN_MESSAGE
				);
		
				// Route
			switch (route) {
				case 1:
					cost = (route_cost - (passengerType * route_cost));
					break;
				
				case 2:
					cost = (route_cost - (passengerType * route_cost));
					break;
					
				default:
					JOptionPane.showMessageDialog(
							null,
							"Error: Try Again", 
							"ERROR", 
							JOptionPane.PLAIN_MESSAGE
							);
							break;
				
				}
			
			JOptionPane.showMessageDialog(
					null, 
					"Bayad ka po ng " +
					cost +
					" Php",
					"Please Pay!",
					JOptionPane.PLAIN_MESSAGE
					);
			
			//Payment
			pay = Double.parseDouble(JOptionPane.showInputDialog(
					null, 
					"Lagay mo dito bayad mo: ",
					"Payment",
					JOptionPane.PLAIN_MESSAGE
					));
			
			//Change
			change = pay - cost;
			
			JOptionPane.showMessageDialog(
					null, 
					"You paid: " +
					pay +
					"\nHere's your Change: " +
					change +
					" Php",
					"Enjoy Kabacan Express!",
					JOptionPane.PLAIN_MESSAGE
					);
			
	}
}


