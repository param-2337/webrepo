package eTour_package;

public class ItineryMaster {
	private long itineryId;
	private long categoryMasterId;
	private long dayNumber;
	private String itineryDetails;
	
	public long getItineryId() {
		return itineryId;
	}
	public void setItineryId(long itineryId) {
		this.itineryId = itineryId;
	}
	public long getCategoryMasterId() {
		return categoryMasterId;
	}
	public void setCategoryMasterId(long categoryMasterId) {
		this.categoryMasterId = categoryMasterId;
	}
	public long getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(long dayNumber) {
		this.dayNumber = dayNumber;
	}
	public String getItineryDetails() {
		return itineryDetails;
	}
	public void setItineryDetails(String itineryDetails) {
		this.itineryDetails = itineryDetails;
	}
	
	
}
