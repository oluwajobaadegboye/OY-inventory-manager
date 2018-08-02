package edu.mum.cs.inventorymanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Location implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int locationId;
    private String locationCode;
    private String merchantCode;
    private String regionCode;
    private int noOfBusinessUnits;
    private int merchantId;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String email;
    private String phoneNo;
    private String locationFullAddress;
    private String regionName;
    private int regionId;
    private String merchantName;
    private int noOfLocations;
    private int businessUnitId;
    private String userName;
    private int userId;
    private int isTaxFreeLocation;
    private String locationName;
    private int currencyId;
    private String currencyName;
    private int franchiseId;
    private String franchiseOwner;
    private int locationAcquirerBankId;
    private double daysSales;

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getIsTaxFreeLocation() {
        return isTaxFreeLocation;
    }

    public void setIsTaxFreeLocation(int isTaxFreeLocation) {
        this.isTaxFreeLocation = isTaxFreeLocation;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public int getNoOfLocations() {
        return noOfLocations;
    }

    public void setNoOfLocations(int noOfLocations) {
        this.noOfLocations = noOfLocations;
    }

    public void setLocationFullAddress(String locationFullAddress) {
        this.locationFullAddress = locationFullAddress;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getLocationFullAddress() {
        this.setLocationFullAddress();
        return locationFullAddress;
    }

    public void setLocationFullAddress() {
        this.locationFullAddress = this.getAddress1() + ", " + this.getCity() + ", " + this.getState();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNoOfBusinessUnits() {
        return noOfBusinessUnits;
    }

    public void setNoOfBusinessUnits(int noOfBusinessUnits) {
        this.noOfBusinessUnits = noOfBusinessUnits;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public int getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(int franchiseId) {
        this.franchiseId = franchiseId;
    }

    public String getFranchiseOwner() {
        return franchiseOwner;
    }

    public void setFranchiseOwner(String franchiseOwner) {
        this.franchiseOwner = franchiseOwner;
    }

	public int getLocationAcquirerBankId() {
		return locationAcquirerBankId;
	}

	public void setLocationAcquirerBankId(int locationAcquirerBankId) {
		this.locationAcquirerBankId = locationAcquirerBankId;
	}

	public double getDaysSales() {
		return this.daysSales;
	}

	public void setDaysSales(double daysSales) {
		this.daysSales = daysSales;
	}	

}
