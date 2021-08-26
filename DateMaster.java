package eTour_package;

public class DateMaster {
	private long departureId;
	private long packageId;
	private String departureDate;
	private String endDate;
	private int numberOfDays;
	
	
	public long getDepartureId() {
		return departureId;
	}
	public void setDepartureId(long departureId) {
		this.departureId = departureId;
	}
	public long getPackageId() {
		return packageId;
	}
	public void setPackageId(long packageId) {
		this.packageId = packageId;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	
}
