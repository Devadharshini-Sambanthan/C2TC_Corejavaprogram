package day8.assignment;

public class AirIndia implements AirFare{
	private String flightName;
    private double price;

    // Default constructor
    public AirIndia() {
        this.flightName = "AirIndia";
        this.price = 5000.0;
    }

    // Parameterized constructor
    public AirIndia(String flightName, double price) {
        this.flightName = flightName;
        this.price = price;
    }

    // Getters
    public String getFlightName() {
        return flightName;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Implement interface method
    public void bookTicket() {
        System.out.println("Ticket booked with AirIndia. Price: " + price);
    }
}


