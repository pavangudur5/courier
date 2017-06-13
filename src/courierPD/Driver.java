package courierPD;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
	
	private String number;
	private String name;

	public Driver()
	{
		this.name = "name";
		this.number = "0";
	}
	
	public Driver(String number, String name)
	{
		this.name = name;
		this.number = number;
		System.out.println(name);
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

	@Override
	public String toString() {
		return getNumber() + getName();
	}
}