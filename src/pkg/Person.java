package pkg;

public abstract class Person {
	
	private String firstName, lastName, address, roomNum, city, state, zipCode;
	
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

	
	//Constructor
	public Person(String firstName, String lastName, String address, String roomNum, String city, String state,
			String zipCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.roomNum = roomNum;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	//No-arg Constructor.
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", roomNum="
				+ roomNum + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode;
	}

}
