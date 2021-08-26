package eTour_package;

public class CostMaster {
	private long costId;
	private long categoryMasterId;
	private double cost;
	private double singlePersonCost;
	private double extraPersonCost;
	private double childWithBedCost;
	private double childWithoutBedCost;
	private String validFrom;
	private String validTo;
	
	
	public long getCostId() {
		return costId;
	}
	public void setCostId(long costId) {
		this.costId = costId;
	}
	public long getCategoryMasterId() {
		return categoryMasterId;
	}
	public void setCategoryMasterId(long categoryMasterId) {
		this.categoryMasterId = categoryMasterId;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getSinglePersonCost() {
		return singlePersonCost;
	}
	public void setSinglePersonCost(double singlePersonCost) {
		this.singlePersonCost = singlePersonCost;
	}
	public double getExtraPersonCost() {
		return extraPersonCost;
	}
	public void setExtraPersonCost(double extraPersonCost) {
		this.extraPersonCost = extraPersonCost;
	}
	public double getChildWithBedCost() {
		return childWithBedCost;
	}
	public void setChildWithBedCost(double childWithBedCost) {
		this.childWithBedCost = childWithBedCost;
	}
	public double getChildWithoutBedCost() {
		return childWithoutBedCost;
	}
	public void setChildWithoutBedCost(double childWithoutBedCost) {
		this.childWithoutBedCost = childWithoutBedCost;
	}
	public String getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getValidTo() {
		return validTo;
	}
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
	
	
}
