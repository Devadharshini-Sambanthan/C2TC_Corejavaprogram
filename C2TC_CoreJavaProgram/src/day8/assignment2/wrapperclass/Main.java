package day8.assignment2.wrapperclass;

public class Main {
	public static void main(String[] args) {
		
		AirIndia ai = new AirIndia(3, 1500.0);
		System.out.println("AirIndia amount: ₹" + ai.calculateAmount());
		
		Indigo ind = new Indigo(2, 1800.0);
        System.out.println("Indigo Amount: ₹" + ind.calculateAmount());
	}

}
