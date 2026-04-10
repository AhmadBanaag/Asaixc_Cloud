package allAboutJ.writingAndReading;

import javax.swing.JOptionPane;

public class Vehicle {

    // Fields
    protected String manufacturer;
    protected String model;
    protected String plateNumber;
    protected int passengerLimit;

    // Class variable
    protected static int vehicleCount;

    // Default constructor
    public Vehicle() {
        vehicleCount++;
    }

     // Accessors and Mutators 
    public String getManufacturer() { 
    	return manufacturer; }

    public void setManufacturer(String manufacturer) {
        manufacturer = JOptionPane.showInputDialog(
        		null,
        		"ENTER MANUFACTURER:",
        		"Trip to USM",
        		3);
        this.manufacturer = manufacturer;
    }

    public String getModel() { 
    	return model; }

    public void setModel(String model) {
        model = JOptionPane.showInputDialog(
        		null,
        		"ENTER MODEL:",
        		"Trip to USM",
        		3);
        this.model = model;
    }

    public String getPlateNumber() { 
    	return plateNumber; }

    public void setPlateNumber(String plateNumber) {
        plateNumber = JOptionPane.showInputDialog(
        		null,
        		"ENTER PLATE NUMBER:",
        		"Trip to USM",
        		3);
        this.plateNumber = plateNumber;
    }

    public int getPassengerLimit() { 
    	return passengerLimit; }

    public void setPassengerLimit(int passengerLimit) {
        passengerLimit = Integer.parseInt(JOptionPane.showInputDialog(
        		null,
        		"ENTER PASSENGER LIMIT:",
        		"Trip to USM",
        		3));
        this.passengerLimit = passengerLimit;
    }
    
    public static int getVehicleCount() { 
    	return vehicleCount; }

    // TripTicket method
    public String TripTicket() {
        return "MANUFACTURER: " + getManufacturer() +
               "\nMODEL: " + getModel() +
               "\nPLATE NUMBER: " + getPlateNumber() +
               "\nPASSENGER LIMIT: " + getPassengerLimit() +
               "\nVEHICLE COUNT: " + getVehicleCount();
    }
}
