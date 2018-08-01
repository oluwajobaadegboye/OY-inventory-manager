package edu.mum.cs.inventorymanager.model;

public class Salesman extends BusinessUnit implements java.io.Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int salesmanId;	
	private String salesmanCardNo;
	private String salesmanVehicleRegNo;
	private String salesmanVehicleModel;
	private String salesmanVehicleManufacturer;
	private String staffId;
	private String salesmanName;
	private String locationName;
	
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
	}
	public String getSalesmanName() {
		salesmanName=this.getContactFullName();
		return salesmanName;
	}
	public void setSalesmanName() {
		this.salesmanName = this.getContactFullName();
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getSalesmanCardNo() {
		return salesmanCardNo;
	}
	public void setSalesmanCardNo(String salesmanCardNo) {
		this.salesmanCardNo = salesmanCardNo;
	}
	public int getSalesmanId() {
		return salesmanId;
	}
	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}
	public String getSalesmanVehicleManufacturer() {
		return salesmanVehicleManufacturer;
	}
	public void setSalesmanVehicleManufacturer(String salesmanVehicleManufacturer) {
		this.salesmanVehicleManufacturer = salesmanVehicleManufacturer;
	}
	public String getSalesmanVehicleModel() {
		return salesmanVehicleModel;
	}
	public void setSalesmanVehicleModel(String salesmanVehicleModel) {
		this.salesmanVehicleModel = salesmanVehicleModel;
	}
	public String getSalesmanVehicleRegNo() {
		return salesmanVehicleRegNo;
	}
	public void setSalesmanVehicleRegNo(String salesmanVehicleRegNo) {
		this.salesmanVehicleRegNo = salesmanVehicleRegNo;
	}
	
	
}
