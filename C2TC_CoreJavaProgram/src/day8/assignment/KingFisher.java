package day8.assignment;

public class KingFisher implements AirFare{ 
	private String flightName;
    private double price;

    // Default constructor
    public KingFisher() {
        this.flightName = "KingFisher";
        this.price = 4500.0;
    }

    // Parameterized constructor
    public KingFisher(String flightName, double price) {
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
        System.out.println("Ticket booked with KingFisher. Price: " + price);
    }

}
