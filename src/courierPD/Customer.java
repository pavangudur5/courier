package courierPD;

public class Customer {
	
	private String number;
	private String name;
	private String avenue;
	private String street;
	private String Phno;
	
	public Customer()
	{
		this.number = " ";
		this.name = " ";
		this.avenue = "";
		this.street = "";
		this.Phno = " ";
	}

	public Customer(String number, String name, String avenue, String street, String Phno)
	{
		this.avenue = avenue;
		this.name = name;
		this.number = number;
		this.street = street;
		this.Phno = Phno;
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
	public String getAvenue() {
		return avenue;
	}
	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPhno(String text) {
		this.Phno = text;
	}
	public String getPhno() {
		return Phno;
	}

	@Override
	public String toString() {
		return getNumber() + " " +getName();
	}

	
}
