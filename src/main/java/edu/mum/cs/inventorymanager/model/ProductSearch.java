package edu.mum.cs.inventorymanager.model;

public class ProductSearch implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private int productId;
	private int locationId;
	private int businessUnitId;
	private int salesmanId;
	
	public int getBusinessUnitId() {
		return businessUnitId;
	}
	public void setBusinessUnitId(int businessUnitId) {
		this.businessUnitId = businessUnitId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getSalesmanId() {
		return salesmanId;
	}
	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}
	
	

}
