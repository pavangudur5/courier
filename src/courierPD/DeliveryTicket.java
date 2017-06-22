package courierPD;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DeliveryTicket {
	
	DateTimeFormatter Dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	DateTimeFormatter Timeformatter = DateTimeFormatter.ofPattern("HH:mm"); 
	
	
	private LocalDateTime date;
	private LocalDateTime time;
	private String ordertaken;
	private String PickupCustomer;
	private String CustomerNamep;
	private LocalDateTime pickUpTime;
	private String BillToPickUp;
	private String DeliveryCustomerNumber;
	private String CustomerNamed;
	private String BillToDeliveryUp;
	private String PackageId;
	private String EstDeliveryTime;
	private String EstBlocks;
	private String QuotedPrice;
	private String DriverNumber;
	private String AssignedTime;
	private LocalTime ActPickUpTime;
	private LocalTime ActDeliveryTime;
	private String Bonus;
	
//	String FormattedpickUpTime = pickUpTime.format(Timeformatter);
//	String FormattedAcrDelUpTime = ActDeliveryTime.format(Timeformatter);
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM");
	
	public DeliveryTicket() {
		this.date = date.now();
		this.time = time.now();
		this.ordertaken = "" ;
		this.PickupCustomer = "";
		this.CustomerNamep = "";
		this.pickUpTime = time.now();
		this.BillToPickUp = "";
		this.DeliveryCustomerNumber = "";
		this.CustomerNamed = "";
		this.BillToDeliveryUp = "";
		this.PackageId = "";
		this.EstDeliveryTime = "";
		this.EstBlocks = "";
		this.QuotedPrice = "";
		this.DriverNumber = "";
		this.AssignedTime = "";
		this.ActPickUpTime = LocalTime.now();
		this.ActDeliveryTime = LocalTime.now();
		this.Bonus = "";
	}

	public DeliveryTicket(LocalDateTime date, LocalDateTime time, String ordertaken, String pickupCustomer,
			String customerNamep, LocalDateTime pickUpTime, String billToPickUp, String deliveryCustomerNumber,
			String customerNamed, String billToDeliveryUp, String packageId, String estDeliveryTime, String estBlocks,
			String quotedPrice, String driverNumber, String assignedTime, String actPickUpTime, String actDeliveryTime,
			String bonus) {
		this.date = date;
		this.time = time;
		this.ordertaken = ordertaken;
		this.PickupCustomer = pickupCustomer;
		this.CustomerNamep = customerNamep;
		this.pickUpTime = pickUpTime;
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

	public LocalDateTime getTime() {
		return this.time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getOrdertaken() {
		return this.ordertaken;
	}

	public void setOrdertaken(String ordertaken) {
		this.ordertaken = ordertaken;
	}

	public String getPickupCustomer() {
		return this.PickupCustomer;
	}

	public void setPickupCustomer(String pickupCustomer) {
		this.PickupCustomer = pickupCustomer;
	}

	public String getCustomerNamep() {
		return this.CustomerNamep;
	}

	public void setCustomerNamep(String customerNamep) {
		this.CustomerNamep = customerNamep;
	}

	public LocalDateTime getPickUpTime() {
		return this.pickUpTime;
	}

	public void setPickUpTime(LocalDateTime pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public String getBillToPickUp() {
		return this.BillToPickUp;
	}

	public void setBillToPickUp(String billToPickUp) {
		this.BillToPickUp = billToPickUp;
	}

	public String getDeliveryCustomerNumber() {
		return this.DeliveryCustomerNumber;
	}

	public void setDeliveryCustomerNumber(String deliveryCustomerNumber) {
		this.DeliveryCustomerNumber = deliveryCustomerNumber;
	}

	public String getCustomerNamed() {
		return this.CustomerNamed;
	}

	public void setCustomerNamed(String customerNamed) {
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

	public String getEstDeliveryTime() {
		return this.EstDeliveryTime;
	}

	public void setEstDeliveryTime(String estDeliveryTime) {
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

	public String getDriverNumber() {
		return this.DriverNumber;
	}

	public void setDriverNumber(String driverNumber) {
		this.DriverNumber = driverNumber;
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
}
