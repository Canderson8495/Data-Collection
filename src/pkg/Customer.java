package pkg;

public class Customer extends Person{
	private double amountOwed;
	private final double INTERESTRATE = 4;
	
	//Getters and Setters
	public double getAmountOwed() {
		return amountOwed;
	}

	public void setAmountOwed(double amountOwed) {
		this.amountOwed = amountOwed;
	}
	
	public double getInterestRate() {
		return INTERESTRATE;
	}
	
	//There's no reason to hold a variable inside this method. just go ahead and put it as a constant with our other variables.
	
	//AccrueMonthly Interest should act as an increment on our current amount. as accrue == accumulate
	public void accrueMonthlyInterest() {
		//Essentially this increments our amountOwed like a credit card that wasn't paid off at the end of the month.
		amountOwed += (amountOwed * (INTERESTRATE/100));
	}
	public Customer(String firstName, String lastName, String address, String roomNum, String city, String state,
			String zipCode, double amountOwed) {
		super(firstName, lastName, address, roomNum, city, state, zipCode);
		this.amountOwed = amountOwed;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString() + "AmountOwed: " + amountOwed;
	}

}
