package edu.mum.cs.inventorymanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "merchant")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Merchant extends UserRole implements java.io.Serializable {

    private int merchantId;
    private String merchantCode;
    private String merchantName;
    private Status merchantStatus;
    private double creditBalance;
    private List<Location> locations;
    private String merchantImageUrl;

    public Merchant() {
    }

    public Merchant(int merchantId, String merchantCode, String merchantName, Status merchantStatus,
                    double creditBalance, List<Location> locations, String merchantImageUrl) {
        this.merchantId = merchantId;
        this.merchantCode = merchantCode;
        this.merchantName = merchantName;
        this.merchantStatus = merchantStatus;
        this.creditBalance = creditBalance;
        this.locations = locations;
        this.merchantImageUrl = merchantImageUrl;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Status getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(Status merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public String getMerchantImageUrl() {
        return merchantImageUrl;
    }

    public void setMerchantImageUrl(String merchantImageUrl) {
        this.merchantImageUrl = merchantImageUrl;
    }
}
