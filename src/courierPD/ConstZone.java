package courierPD;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConstZone {
	
	private String ConstructionNo;
	private String avenue;
	private String streetNo;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public ConstZone() {
		ConstructionNo = " ";
		avenue = " ";
		streetNo = " ";
		startDate = LocalDate.now();
		endDate = LocalDate.now();
	}

	public ConstZone(String constructionNo, String avenue, String streetNo) {
		this.ConstructionNo = constructionNo;
		this.avenue = avenue;
		this.streetNo = streetNo;
	}

	public String getConstructionNo() {
		return this.ConstructionNo;
	}

	public void setConstructionNo(String constructionNo) {
		this.ConstructionNo = constructionNo;
	}

	public String getAvenue() {
		return this.avenue;
	}

	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}

	public String getStreetNo() {
		return this.streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return this.endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return getConstructionNo() + " from " + getStartDate() + " till "+ getEndDate();
	}
	
	

}
