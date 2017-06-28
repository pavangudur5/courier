package courierPD;

public class User {
	
	private String name;
	private String password;
	private String number;
	private String phno;
	private String email_id;
	private String role;
	
	public User()
	{
		this.name = " ";
		this.password = " ";
		this.number = " ";
		this.phno = " ";
		this.email_id = " ";
		this.role = " ";
	}
	
	public User(String id, String name, String password, String phno, String email_id, String role) 
	{
		this.name = name;
		this.password = password;
		this.number = id;
		this.phno = phno;
		this.email_id = email_id;
		this.role = role;
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhno() {
		return this.phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getEmail_id() {
		return this.email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean isAuthorized(String password) {
		return getPassword().compareTo(password)==0; 
	}

	@Override
	public String toString() {
		return   getName();
	}
	
}
