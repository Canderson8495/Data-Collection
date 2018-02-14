package pkg;

public class Person {
	
	private final double INTERESTRATE = 4;
	private String firstName, lastName, address, roomNum, city, state, zipCode;
	private double amountOwed;
	
	//Getters and Setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public double getAmountOwed() {
		return amountOwed;
	}

	public void setAmountOwed(double amountOwed) {
		this.amountOwed = amountOwed;
	}
	
	public double getInterestRate() {
		return INTERESTRATE;
	}
	
	//Constructor
	public Person(String firstName, String lastName, String address, String roomNum, String city, String state,
			String zipCode, double amountOwed) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.roomNum = roomNum;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.amountOwed = amountOwed;
	}
	//No-arg Constructor.
	public Person() {
		super();
	}
	//There's no reason to hold a variable inside this method. just go ahead and put it as a constant with our other variables.
	
	//AccrueMonthly Interest shoud act as an increment on our current amount. as accrue == accumulate
	public void accrueMonthlyInterest() {
		//Essentially this increments our amountOwed like a credit card that wasn't paid off at the end of the month.
		amountOwed += (amountOwed * (INTERESTRATE/100));
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", roomNum="
				+ roomNum + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", amountOwed="
				+ amountOwed + "]";
	}

}
