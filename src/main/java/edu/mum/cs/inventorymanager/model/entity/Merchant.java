package edu.mum.cs.inventorymanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.mum.cs.inventorymanager.model.Location;
import edu.mum.cs.inventorymanager.model.Status;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "merchant")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="tbl_merchant")
public class Merchant implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int merchantId;
    private String merchantCode;
    @NotEmpty(message = "*Merchant Name is required")
    private String merchantName;
    private String merchantStatus;
    private double creditBalance;
    private long locationId;
    private String merchantImageUrl;
    private User user;

    public Merchant() {
    }

    public Merchant(int merchantId, String merchantCode, String merchantName, String merchantStatus,
                    double creditBalance, long locationId, String merchantImageUrl) {
        this.merchantId = merchantId;
        this.merchantCode = merchantCode;
        this.merchantName = merchantName;
        this.merchantStatus = merchantStatus;
        this.creditBalance = creditBalance;
        this.locationId = locationId;
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

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    public String getMerchantImageUrl() {
        return merchantImageUrl;
    }

    public void setMerchantImageUrl(String merchantImageUrl) {
        this.merchantImageUrl = merchantImageUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
