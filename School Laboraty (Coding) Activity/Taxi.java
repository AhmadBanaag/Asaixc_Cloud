package allAboutJ.writingAndReading;

import javax.swing.JOptionPane;

public class Taxi extends Vehicle {

    //  Fields
    private String operatorName;   // name of operator and type of taxi
    private int numOfPassengers, taxiType;             // number of passengers
    private double distanceTraveled, fare;         // distance in kilometers and computed fare

    // Default Constructor
    public Taxi() {
        super(); // calls Vehicle constructor
    }

    public String getOperatorName() {
        return operatorName;
    }
    
    public void setOperatorName(String operatorName) {
        operatorName = JOptionPane.showInputDialog(
        		null,
        		"ENTER OPERATOR NAME:",
        		"Trip to USM",
        		3);
        this.operatorName = operatorName;
    }

    public String getTaxiType() {
        if (taxiType == 1) {
        	return "AIRCON";
        } else if (taxiType == 2) {
        	return "REGULAR";
        } else {
        	return "NOT AVAILABLE";
        }
    }
    
    public void setTaxiType(int taxiType) {
        taxiType = Integer.parseInt(JOptionPane.showInputDialog(
        		null,
        		"ENTER TAXI TYPE (Aircon/Regular):" +
        		"\n[1] - AIRCON" +
        		"\n[2] - REGULAR",
        		"Trip to USM",
        		3));
        this.taxiType = taxiType;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }
    
    public void setNumOfPassengers(int numOfPassengers) {
        numOfPassengers = Integer.parseInt(JOptionPane.showInputDialog(
        		null,
        		"ENTER NUMBER OF PASSENGERS:",
        		"Trip to USM",
        		3));
        this.numOfPassengers = numOfPassengers;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }
    
    // Ask user to input distance traveled
    public void setDistanceTraveled(double distanceTraveled) {
        distanceTraveled = Double.parseDouble(JOptionPane.showInputDialog(
        		null,
        		"ENTER DISTANCE TRAVELED(km):",
        		"Trip To USM",
        		3));
        this.distanceTraveled = distanceTraveled;
    }

    public double getFare() {
        return fare;
    }
    
    // ===== CALCULATE FARE METHOD =====
    public void calculateFare() {
    	  double flagdown = 0;   // starting fare
    	  double additional = 0; // fare per kilometer
    	// Check taxi type and assign rates
        if (taxiType == 1) {
            flagdown = 40;     // Aircon base fare
            additional = 15;   // Aircon per km
        } else if (taxiType == 2) {
            flagdown = 30;     // Regular base fare
            additional = 10; // Regular per km
        }
        // Formula: fare = flagdown + (additional * distance)
        fare = flagdown + (additional * getDistanceTraveled());
    }

    // ===== OVERRIDDEN METHOD =====
    @Override
    public String TripTicket() {

        String warning = ""; // warning message if overloaded

        // Check if passengers exceed limit
        if (numOfPassengers > getPassengerLimit()) {
            warning = "\nWARNING: Vehicle is OVERLOADING!";
        }

        // Return full trip details 
        return super.TripTicket() +
               "\nOPERATOR NAME: " + getOperatorName() +
               "\nTAXI TYPE: " + getTaxiType() +
               "\nNUMBER OF PASSENGERS " + getNumOfPassengers() +
               "\nDISTANCE TRAVELED: " + getDistanceTraveled() +
               "km\nFARE: PHP " + getFare() +
               warning; 
    }
}
