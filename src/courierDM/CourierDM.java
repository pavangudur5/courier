package courierDM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import courierPD.Courier;
import courierPD.Customer;
import courierPD.DeliveryTicket;
import courierPD.DijAlgo;
import courierPD.Driver;
import courierPD.Graph;
import courierPD.Intersection;
import courierPD.StreetSegment;
import courierPD.User;

public class CourierDM {
	
	public static void loadMapinfo(Courier mycourier) {
		
		List<Intersection> nodes;
		List<StreetSegment> edges;
		
		nodes = new ArrayList<Intersection>();
		edges = new ArrayList<StreetSegment>();
		for(int i = 0; i < 102; i++ )
		{
			Intersection location = new Intersection("" +i, "" +i);
		nodes.add(location);
		}
		
		
		String fileName1 = "streets.csv";
		String line = null;
		try {
		FileReader fileReader1 = new FileReader(fileName1);
		BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
		
		while((line = bufferedReader1.readLine()) != null)
		{
			String [] block = line.split(",");
			switch (block[0])
			{
			case  "road":
				int x = Integer.parseInt(block[2]);
				int y = Integer.parseInt(block[3]);
				int z = Integer.parseInt(block[4]);
				addLane(block[1],x,y,z,nodes,edges);
				break;
				default:
					System.out.println("something is rong in loading map info");
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
	
		Graph graph = new Graph(nodes, edges);
		DijAlgo DijAlgo = new DijAlgo(graph);
		DijAlgo.execute(nodes.get(1));
		LinkedList<Intersection> path = DijAlgo.getPath(nodes.get(7)); //  this is just an example for now. 
//		Intersection intersection = new Intersection();
//		System.out.println(intersection .toString());
        
		for (Intersection inter : path) {
            System.out.println(inter);
        }
	}

		private static void addLane(String id, int source, int destination, int weight, List<Intersection> nodes, List<StreetSegment> edges) {
			StreetSegment lane = new StreetSegment(id, nodes.get(source), nodes.get(destination), weight);
			edges.add(lane);
		}

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

