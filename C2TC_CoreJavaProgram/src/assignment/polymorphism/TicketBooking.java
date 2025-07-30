package assignment.polymorphism;

public class TicketBooking {
    // Private attributes
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public TicketBooking() {
    }

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Method for cash payment
    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    // Method for wallet payment
    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    // Method for credit card payment
    public void makePayment(String cardHolderName, double amount, String cardType, String ccv) {
        System.out.printf("Holder name: %s\nAmount %.1f paid using %s card\nCCV: %s\n", 
                          cardHolderName, amount, cardType, ccv);
    }
}

