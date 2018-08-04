package edu.mum.cs.inventorymanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "merchant")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="tbl_merchant",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"merchant_name"}
        )
)
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int merchantId;
    @NotEmpty(message = "*Merchant Name is required")
    private String merchantName;
    private String merchantStatus="Active";
    @ManyToMany
    @JoinColumn(name = "locationId")
    private List<Location> locations;
    private String merchantImageUrl;
    @OneToOne
    @JoinColumn(name = "userId")
    @NotNull
    private User user;
    @NotEmpty(message = "*address is required")
    private String address;

    public Merchant() {
    }


    public Merchant(String merchantName, String merchantStatus,User user,String address) {
        this.merchantName = merchantName;
        this.merchantStatus = merchantStatus;
        this.user = user;
        this.address = address;
    }

    public Merchant(String merchantName, String merchantStatus,User user,List<Location> locations,String address) {
        this.merchantName = merchantName;
        this.merchantStatus = merchantStatus;
        this.user = user;
        this.locations = locations;
        this.address = address;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
