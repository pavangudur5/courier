package courierPD;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Repair {
	
	private DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	private LocalDate StartTime;
	private LocalDate EndTime;
	
	public Repair() {
		this.StartTime = LocalDate.now();
		this.EndTime = LocalDate.now() ;
	}
	
	public Repair(LocalDate startTime, LocalDate endTime) {
		this.StartTime = startTime;
		this.EndTime = endTime;
	}

	public LocalDate getStartTime() {
		return this.StartTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.StartTime = startTime;
	}

	public LocalDate getEndTime() {
		return this.EndTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.EndTime = endTime;
	}

	@Override
	public String toString() {
		return  getStartTime() + " " +getEndTime() ;
	}
}
