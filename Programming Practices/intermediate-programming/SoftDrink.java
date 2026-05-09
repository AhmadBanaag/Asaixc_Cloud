package puzzles;

import javax.swing.JOptionPane;

public class SoftDrink extends Beverage {
		
	private double sugarLevel;
	
		public SoftDrink() {
			super();
		}
		
		public SoftDrink(String manufacturer, String name, String containerType, double netContent, double sugarLevel) {
			super(manufacturer, name, containerType, netContent);
			this.sugarLevel = sugarLevel;
		}
		
		public double getSugarLevel() {
			return sugarLevel;
		}
		
		public void setSugarLevel(double sugarLevel) {
			this.sugarLevel = Double.parseDouble(JOptionPane.showInputDialog(
					null,
					"ENTER SUGAR LEVEL:",
					"A and W",
					JOptionPane.PLAIN_MESSAGE));
		}
		
		@Override
		public String displayAll() {
			return super.displayAll() +
				   "\nSUGAR LEVEL: " + getSugarLevel();		
		}

}
