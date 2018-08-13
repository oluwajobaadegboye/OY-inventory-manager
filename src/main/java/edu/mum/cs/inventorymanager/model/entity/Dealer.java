package edu.mum.cs.inventorymanager.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tbl_dealer")
public class Dealer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dealerId;
    @NotEmpty(message = "*First Name is required")
    private String firstName;
    @NotEmpty(message = "*Last Name is required")
    private String lastName;
    @NotEmpty(message = "*Mobile is required")
    private String mobile;
    @NotEmpty(message = "*Email is required")
    private String email;
    @NotEmpty(message = "*Contact Address is required")
    private String contactAddress;
    @ManyToOne
    @JoinColumn(name = "merchantId")
    private Merchant merchant;

    public long getDealerId() {
        return dealerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public void setDealerId(long dealerId) {
        this.dealerId = dealerId;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }



}
