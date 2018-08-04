package edu.mum.cs.inventorymanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@JsonIgnoreProperties(ignoreUnknown=true)
@Entity
@Table(name = "tbl_location",
        uniqueConstraints={
                @UniqueConstraint(columnNames = {"merchantId", "locationName"})
        })
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId;
    @NotEmpty(message = "*Location Name is required")
    private String locationName;
    @OneToOne
    @JoinColumn(name = "merchantId")
    private Merchant merchant;
    @NotEmpty(message = "*address is required")
    private String address;

    public Location() {
    }

    public Location(@NotEmpty(message = "*Location Name is required") String locationName, @NotEmpty(message = "*address is required") String address) {
        this.locationName = locationName;
        this.merchant = merchant;
        this.address = address;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
