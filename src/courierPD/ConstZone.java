package courierPD;

import java.time.LocalDateTime;

public class ConstZone {
	
	private String ConstructionNo;
	private String avenue;
	private String streetNo;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	
	public ConstZone() {
		ConstructionNo = " ";
		avenue = " ";
		streetNo = " ";
		startDateTime = LocalDateTime.now();
		endDateTime = LocalDateTime.now();
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

	public LocalDateTime getStartDateTime() {
		return this.startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return this.endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	@Override
	public String toString() {
		return getConstructionNo() + " " + getAvenue() + " " + getStreetNo();
	}
	
	

}
