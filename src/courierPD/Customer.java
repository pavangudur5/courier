package courierPD;

public class Customer {
	
	private String number;
	private String name;
	private String Phno;
	private String address;
	private String avenue;
	private String street;
	
	public Customer()
	{
		this.number = "";
		this.name = "";
		this.Phno = " ";
		this.address = "";
		this.avenue = " ";
		this.street = " ";
	}

	public Customer(String number, String name, String Phno, String avenue, String street)
	{
		this.name = name;
		this.number = number;
		this.Phno = Phno;
		this.setAddress(address);
		this.avenue = avenue;
		this.street = street;
	}
	
	public String getAvenue() {
		return this.avenue;
	}

	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhno(String text) {
		this.Phno = text;
	}
	public String getPhno() {
		return Phno;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address2) {
		this.address = address2;
	}

	@Override
	public String toString() {
		return getName();
	}
}
