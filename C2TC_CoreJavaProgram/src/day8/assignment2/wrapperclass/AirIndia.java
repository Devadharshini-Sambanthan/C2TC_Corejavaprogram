package day8.assignment2.wrapperclass;

public class AirIndia implements Airfare {
	 private int hours;
	    private double costPerHour;

	    // Default constructor
	    public AirIndia() {
	        this.hours = 1;
	        this.costPerHour = 1000.0;
	    }

	    // Parameterized constructor
	    public AirIndia(int hours, double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    // Getters
	    public int getHours() {
	        return hours;
	    }

	    public double getCostPerHour() {
	        return costPerHour;
	    }

	    // Setters
	    public void setHours(int hours) {
	        this.hours = hours;
	    }

	    public void setCostPerHour(double costPerHour) {
	        this.costPerHour = costPerHour;
	    }

	    // Implementing method from Airfare interface
	    public double calculateAmount() {
	        return hours * costPerHour;
	    }

}
