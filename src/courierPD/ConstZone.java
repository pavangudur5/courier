package courierPD;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConstZone {
	
	private String ConstructionNo;
	private Intersection streetNo;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public ConstZone() {
		ConstructionNo = " ";
		startDate = LocalDate.now();
		endDate = LocalDate.now();
	}

	public ConstZone(Intersection inter, String constructionNo, String avenue, String streetNo, Intersection intersection) {
		this();
		this.ConstructionNo = constructionNo;
//		inter.setId(this);
	}

	public String getConstructionNo() {
		return this.ConstructionNo;
	}

	public void setConstructionNo(String constructionNo) {
		this.ConstructionNo = constructionNo;
	}

	public Intersection getStreetNo() {
		return this.streetNo;
	}

	public void setStreetNo(Intersection streetNo) {
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
