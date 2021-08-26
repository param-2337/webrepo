package eTour_package;

public class BookingHeaderTable {
	private long bookingId;
	private String bookingDteails;
	private long customerId;
	private long packageId;
	private long departureId;
	private long numberOfPass;
	private double tourAmount;
	private double taxes;
	private double totalAmount;
	
	
	
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingDteails() {
		return bookingDteails;
	}
	public void setBookingDteails(String bookingDteails) {
		this.bookingDteails = bookingDteails;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getPackageId() {
		return packageId;
	}
	public void setPackageId(long packageId) {
		this.packageId = packageId;
	}
	public long getDepartureId() {
		return departureId;
	}
	public void setDepartureId(long departureId) {
		this.departureId = departureId;
	}
	public long getNumberOfPass() {
		return numberOfPass;
	}
	public void setNumberOfPass(long numberOfPass) {
		this.numberOfPass = numberOfPass;
	}
	public double getTourAmount() {
		return tourAmount;
	}
	public void setTourAmount(double tourAmount) {
		this.tourAmount = tourAmount;
	}
	public double getTaxes() {
		return taxes;
	}
	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
}
