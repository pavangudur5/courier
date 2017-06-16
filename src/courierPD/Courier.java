package courierPD;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;

import courierPD.Customer;


public class Courier {
	
	private String name;
	private String street;
	private String avenue;
	private String blocksToMile;
	private String Delivery_Chargers;
	private String bonusAmount;
	private TreeMap<String, Customer> customer;
	private TreeMap<String, User> user;
	private TreeMap<String, Driver> driver;
	private String usernumber;
	private TreeMap<String, DeliveryTicket> deliveryTicket;
	private TreeMap<String, ConstZone> constzone;
	
	
	public Courier()
	{
		this.getname();
		this.getstreet();
		this.getavenue();
		this.getBlocksToMile();
		this.getBonusAmount();
		this.getDelivery_Chargers();
		customer = new TreeMap <String, Customer>();
		driver = new TreeMap <String, Driver>();
		user = new TreeMap <String, User>();
		deliveryTicket = new TreeMap <String, DeliveryTicket>();
		constzone = new TreeMap <String, ConstZone>();
	}

	public String getname(){
		return this.name;
	}
	public void setname(String name){
		this.name = name;
	}
	
	public String getstreet(){
		return this.street;
	}
	public void setstreet(String street){
		this.street = street;
	}
	
	public String getavenue(){
		return this.avenue;
	}
	public void setavenue(String avenue){
		this.avenue = avenue;
	}

	public TreeMap<String, Customer> getCustomer() {
		return this.customer;
	}

	public void setCustomer(TreeMap<String, Customer> customer) {
		this.customer = customer;
	}
	
	public TreeMap<String, User> getUser() {
		return this.user;
	}

	public void setUser(TreeMap<String, User> user) {
		this.user = user;
	}

	public TreeMap<String, Driver> getDriver() {
		return this.driver;
	}

	public void setDriver(TreeMap<String, Driver> driver) {
		this.driver = driver;
	}

	public String getUsernumber() {
		return this.usernumber;
	}

	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}
	
	public String getBlocksToMile() {
		return this.blocksToMile;
	}

	public void setBlocksToMile(String result) {
		this.blocksToMile = result;
	}

	public String getDelivery_Chargers() {
		return this.Delivery_Chargers;
	}

	public void setDelivery_Chargers(String billAmount) {
		this.Delivery_Chargers = billAmount;
	}

	public String getBonusAmount() {
		return this.bonusAmount;
	}

	public void setBonusAmount(String bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public TreeMap<String, DeliveryTicket> getDeliveryTicket() 
	{
		return this.deliveryTicket;
	}

	public void setDeliveryTicket(TreeMap<String, DeliveryTicket> deliveryTicket)
	{
		this.deliveryTicket = deliveryTicket;
	}

	public TreeMap<String, ConstZone> getConstzone() {
		return this.constzone;
	}

	public void setConstzone(TreeMap<String, ConstZone> constzone) {
		this.constzone = constzone;
	}

	public ArrayList getCustomerList()
	{
		ArrayList customerList = new ArrayList();
		for (Entry <String, Customer> customerEntry : getCustomer().entrySet())
		{
			customerList.add(customerEntry.getValue());
		}
		return customerList;
	}
	
	public ArrayList getUserList()
	{
		ArrayList userList = new ArrayList();
		for (Entry <String, User> userEntry : getUser().entrySet())
		{
			userList.add(userEntry.getValue());
		}
		return userList;
	}
	
	public ArrayList getDriverList()
	{
		ArrayList driverList = new ArrayList();
		for (Entry <String, Driver> driverEntry : getDriver().entrySet())
		{
			driverList.add(driverEntry.getValue());
		}
		return driverList;
	}
	
	public ArrayList getDeliveryTicketList()
	{
		ArrayList deliveryTicketList = new ArrayList();
		for (Entry <String, DeliveryTicket> deliveryTicketEntry : getDeliveryTicket().entrySet())
		{
			deliveryTicketList.add(deliveryTicketEntry.getValue());
		}
		return deliveryTicketList;
	}
	
	public void addCustomer(Customer customer)
	{
		if (customer != null)
		{
			getCustomer().put(customer.getNumber(), customer);
		}
	}
	
	public void removeCustomer(Customer cutomer)
	{
		if (cutomer != null)
		{
			getCustomer().remove(cutomer.getNumber());
		}
	}
	
	public void addUser(User user)
	{
		if (user != null)
		{

			getUser().put(user.getNumber(), user);
		}
	}
	
	public void removeUser(User user)
	{
		if (user != null)
		{
			getUser().remove(user.getNumber());
		}
	}
	
	public void addDriver(Driver driver)
	{
		if (driver != null)
		{
			getDriver().put(driver.getNumber(), driver);
		}
	}
	
	public void removeDriver(Driver driver)
	{
		if (driver != null)
		{
			getDriver().remove(driver.getNumber());
		}
	}
	
	public void addDileveryTicket(DeliveryTicket deliveryTicket)
	{
		if (deliveryTicket != null)
		{
			getDeliveryTicket().put(deliveryTicket.getPackageId(), deliveryTicket);
		}
	}
	
	public void removeDileveryTicket(DeliveryTicket deliveryTicket)
	{
		if (deliveryTicket != null)
		{
			getDeliveryTicket().remove(deliveryTicket.getPackageId());
		}
	}
	
	public void addConstZone(ConstZone constZone)
	{
		if (constZone != null)
		{
			getConstzone().put(constZone.getConstructionNo(), constZone);
		}
	}
	
	public void removeConstZone(ConstZone constZone)
	{
		if (constZone != null)
		{
			getConstzone().remove(constZone.getConstructionNo());
		}
	}
	
	@Override
	public String toString() {
		return "Courier [name=" + name + ", street=" + street + ", avenue=" + avenue + "]";
	}
}
