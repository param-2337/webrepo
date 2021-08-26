package eTour_package;

public class TourCategoryMaster {
	private long categoryMasterId;
	private String categoryId;
	private String subCategoryId;
	private String categoryName;
	private String categoryImagePath;
	private short flag;
	
	
	public long getCategoryMasterId() {
		return categoryMasterId;
	}
	public void setCategoryMasterId(long categoryMasterId) {
		this.categoryMasterId = categoryMasterId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryImagePath() {
		return categoryImagePath;
	}
	public void setCategoryImagePath(String categoryImagePath) {
		this.categoryImagePath = categoryImagePath;
	}
	public short getFlag() {
		return flag;
	}
	public void setFlag(short flag) {
		this.flag = flag;
	}
	
}
