package courierDM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import courierPD.Courier;
import courierPD.Customer;
import courierPD.DeliveryTicket;
import courierPD.Driver;
import courierPD.Graph;
import courierPD.Intersection;
import courierPD.StreetSegment;
import courierPD.User;

public class CourierDM {
	
	

	public static void LoadCompanyInfo(Courier mycourier) throws Exception
	{
		String fileName ="CompanyInfo.csv";
		String line = null;
	
	try {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		while((line = bufferedReader.readLine()) != null)
		{
			String [] result = line.split(",");
			switch (result[0])
			{
				case "Name":
					if (mycourier != null)
						mycourier.setname(result[1]);
					break;
				case "Street":
					mycourier.setstreet(result[1]);
				break;
				case "Avenue":
					mycourier.setavenue(result[1]);
				break;
				case "BlocksToMile":
					mycourier.setBlocksToMile(result[1]);
					break;
				case "Delivery_Chargers":
					mycourier.setDelivery_Chargers(result[1]);
					break;
				case "Bonus":
					mycourier.setBonusAmount(result[1]);
					break;
					
				default:
					System.out.println("Check the file, error in reading" +result[0] + " ");
					break;
			}
		}
		bufferedReader.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Unable to open file:" +fileName);
		}
		catch (IOException ex)
		{
			System.out.println("Error reading file:" +fileName);
		}
	}
	
	public static void LoadCustomerInfo(Courier mycourier) throws Exception
	{
		String fileName1 = "Customer_List.csv";
		String line = null;
		
		try
		{
			FileReader fileReader1 = new FileReader(fileName1);
			BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
			
			while((line = bufferedReader1.readLine()) != null)
			{
				String [] block = line.split(",");
				switch (block[0])
				{
				case  "CustomerList":
					Customer customer = new Customer(block[1], block[2], block[3], block[4], block[5]);
					mycourier.addCustomer(customer);
					break;
				case "User":
					User user = new User(block[1], block[2], block[3], block[4], block[5], block[6]);
					mycourier.addUser(user);
					break;
				case "Courier_List":
					LocalDateTime Date = LocalDateTime.now();
					Driver driver = new Driver(block[1],block[2]);
					mycourier.addDriver(driver);
					break;
				default:
					System.out.println("Error in reading cutomer file");
					break;
				}
			}
			bufferedReader1.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Unable to open file:" +fileName1);
		}
		catch (IOException ex)
		{
			System.out.println("Error reading file:" +fileName1);
		}
		
	}
}

