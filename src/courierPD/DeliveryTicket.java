package courierPD;

import java.time.LocalDateTime;

public class DeliveryTicket {
	
	private LocalDateTime date;
	private LocalDateTime time;
	private String ordertaken;
	private String PickupCustomer;
	private String CustomerNamep;
	private String pickUpTime;
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
	private String ActPickUpTime;
	private String ActDeliveryTime;
	private String Bonus;
	
	public DeliveryTicket() {
		this.date = date.now();
		this.time = time.now();
		this.ordertaken = "" ;
		this.PickupCustomer = "";
		this.CustomerNamep = "";
		this.pickUpTime = "";
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
		this.ActPickUpTime = "";
		this.ActDeliveryTime = "";
		this.Bonus = "";
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

	public String getPickUpTime() {
		return this.pickUpTime;
	}

	public void setPickUpTime(String pickUpTime) {
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

	public String getPackageId() {
		return this.PackageId;
	}

	public void setPackageId(String packageId) {
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

	public String getActPickUpTime() {
		return this.ActPickUpTime;
	}

	public void setActPickUpTime(String actPickUpTime) {
		this.ActPickUpTime = actPickUpTime;
	}

	public String getActDeliveryTime() {
		return this.ActDeliveryTime;
	}

	public void setActDeliveryTime(String actDeliveryTime) {
		this.ActDeliveryTime = actDeliveryTime;
	}

	public String getBonus() {
		return this.Bonus;
	}

	public void setBonus(String bonus) {
		this.Bonus = bonus;
	}

	@Override
	public String toString() {
		return  "Order no:"+ getPackageId()+ "by" +getOrdertaken();
	}
	
	

}
