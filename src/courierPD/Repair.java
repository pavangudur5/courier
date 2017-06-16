package courierPD;

import java.time.LocalDateTime;

public class Repair {
	
	private LocalDateTime StartTime;
	private LocalDateTime EndTime;
	
	public Repair() {
		this.StartTime = null;
		this.EndTime = null ;
	}
	
	public Repair(LocalDateTime startTime, LocalDateTime endTime) {
		this.StartTime = startTime;
		this.EndTime = endTime;
	}

	public LocalDateTime getStartTime() {
		return this.StartTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.StartTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return this.EndTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.EndTime = endTime;
	}

	@Override
	public String toString() {
		return  getStartTime() + " " +getEndTime() ;
	}
}
