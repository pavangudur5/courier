package courierPD;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DeliveryTicket {
	
	DateTimeFormatter Dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private DateTimeFormatter TF = DateTimeFormatter.ofPattern("HH:mm"); 
	
	Courier courier = new Courier();
	private LocalDateTime date;
	private LocalTime time;
	User user = new User();
	Customer customer = new Customer();
	Driver driver = new Driver();
	private User ordertaken;
	private Customer PickupCustomer;
	private Customer CustomerNamep;
	private LocalTime pickUpTime;
	private String BillToPickUp;
	private Customer DeliveryCustomerNumber;
	private Customer CustomerNamed;
	private String BillToDeliveryUp;
	private String PackageId;
	private LocalTime EstDeliveryTime;
	private String EstBlocks;
	private String QuotedPrice;
	private Driver DriverNumber;
	private String AssignedTime;
	private LocalTime ActPickUpTime;
	private LocalTime ActDeliveryTime;
	private String Bonus;
	
//	String FormattedpickUpTime = pickUpTime.format(Timeformatter);
//	String FormattedAcrDelUpTime = ActDeliveryTime.format(Timeformatter);
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
	
	public DeliveryTicket() {
		this.date = date.now();
		this.time = time.now();
		this.pickUpTime = time.now();
		this.BillToPickUp = "";
		this.BillToDeliveryUp = "";
		this.PackageId = "";
//		this.EstDeliveryTime = "";
		this.EstBlocks = "";
		this.QuotedPrice = "";
		this.AssignedTime = "";
		this.ActPickUpTime = LocalTime.now();
		this.ActDeliveryTime = LocalTime.now();
		this.Bonus = "";
	}

	public DeliveryTicket(LocalDateTime date, String time, User ordertaken, Customer pickupCustomer,
			Customer customerNamep, String pickUpTime, String billToPickUp, Customer deliveryCustomerNumber,
			Customer customerNamed, String billToDeliveryUp, String packageId, LocalTime estDeliveryTime, String estBlocks,
			String quotedPrice, Driver driverNumber, String assignedTime, String actPickUpTime, String actDeliveryTime,
			String bonus) {
		this.date = date;
		this.time = LocalTime.parse(time,TF);
		this.ordertaken = ordertaken;
		this.PickupCustomer = pickupCustomer;
		this.CustomerNamep = customerNamep;
		this.pickUpTime = LocalTime.parse(pickUpTime, TF);
		this.BillToPickUp = billToPickUp;
		this.DeliveryCustomerNumber = deliveryCustomerNumber;
		this.CustomerNamed = customerNamed;
		this.BillToDeliveryUp = billToDeliveryUp;
		this.PackageId = packageId;
		this.EstDeliveryTime = estDeliveryTime;
		this.EstBlocks = estBlocks;
		this.QuotedPrice = quotedPrice;
		this.DriverNumber = driverNumber;
		this.AssignedTime = assignedTime;
		setActPickUpTime(LocalTime.parse(actPickUpTime,formatter));
		setActDeliveryTime(LocalTime.parse(actDeliveryTime, formatter));
		this.Bonus = bonus;
	}

	public LocalDateTime getDate() {
		return this.date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return this.time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public User getOrdertaken() {
		return this.ordertaken;
	}

	public void setOrdertaken(User ordertaken) {
		this.ordertaken = ordertaken;
	}

	public Customer getPickupCustomer() {
		return this.PickupCustomer;
	}

	public void setPickupCustomer(Customer pickupCustomer) {
		this.PickupCustomer = pickupCustomer;
	}

	public Customer getCustomerNamep() {
		return this.CustomerNamep;
	}

	public void setCustomerNamep(Customer customerNamep) {
		this.CustomerNamep = customerNamep;
	}

	public LocalTime getPickUpTime() {
		return this.pickUpTime;
	}

	public void setPickUpTime(LocalTime pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getBillToPickUp() {
		return this.BillToPickUp;
	}

	public void setBillToPickUp(String billToPickUp) {
		this.BillToPickUp = billToPickUp;
	}

	public Customer getDeliveryCustomerNumber() {
		return this.DeliveryCustomerNumber;
	}

	public void setDeliveryCustomerNumber(Customer deliveryCustomerNumber) {
		this.DeliveryCustomerNumber = deliveryCustomerNumber;
	}

	public Customer getCustomerNamed() {
		return this.CustomerNamed;
	}

	public void setCustomerNamed(Customer customerNamed) {
		this.CustomerNamed = customerNamed;
	}

	public String getBillToDeliveryUp() {
		return this.BillToDeliveryUp;
	}

	public void setBillToDeliveryUp(String billToDeliveryUp) {
		this.BillToDeliveryUp = billToDeliveryUp;
	}

	public String getNumber() {
		return this.PackageId;
	}

	public void setNumber(String packageId) {
		this.PackageId = packageId;
	}

	public LocalTime getEstDeliveryTime() {
		return this.EstDeliveryTime;
	}

	public void setEstDeliveryTime(LocalTime estDeliveryTime) {
		this.EstDeliveryTime = estDeliveryTime;
	}

	public String getEstBlocks() {
		return this.EstBlocks;
	}

	public void setEstBlocks(String estBlocks) {
		this.EstBlocks = estBlocks;
	}

	public String getQuotedPrice() {
		return this.QuotedPrice;
	}

	public void setQuotedPrice(String quotedPrice) {
		this.QuotedPrice = quotedPrice;
	}

	public Driver getDriverNumber() {
		return this.DriverNumber;
	}

	public void setDriverNumber(Driver driver) {
		this.DriverNumber = driver;
	}

	public String getAssignedTime() {
		return this.AssignedTime;
	}

	public void setAssignedTime(String assignedTime) {
		this.AssignedTime = assignedTime;
	}

	public LocalTime getActPickUpTime() {
		return this.ActPickUpTime;
	}

	public void setActPickUpTime(LocalTime actPickUpTime) {
		this.ActPickUpTime = actPickUpTime;
	}

	public LocalTime getActDeliveryTime() {
		return this.ActDeliveryTime;
	}

	public void setActDeliveryTime(LocalTime ef) {
		this.ActDeliveryTime = ef;
	}

	public String getBonus() {
		return this.Bonus;
	}

	public void setBonus(String bonus) {
		this.Bonus = bonus;
	}

	@Override
	public String toString() {
		return  "Order no:"+ getNumber()+ "by" +getOrdertaken() + " " + getBonus();
	}

	public String calculatebonus(String acttime) {
					System.out.println(EstDeliveryTime + acttime);
			if (EstDeliveryTime.equals(acttime))
			{ 
				setBonus("0");
				return "0";
			}
			else //complete this
			{
				setBonus(courier.getBonusAmount());
				return courier.getBonusAmount();
			}
	}
}
