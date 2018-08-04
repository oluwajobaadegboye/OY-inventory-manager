package edu.mum.cs.inventorymanager.model;

import edu.mum.cs.inventorymanager.model.entity.Merchant;

import javax.validation.constraints.NotEmpty;

public class Dealer {

    private int dealerId;
    private String dealerBusinessAddress;
    private long merchantId;
    private String merchantName;
    @NotEmpty(message = "*First Name is required")
    private String firstName;
    @NotEmpty(message = "*Last Name is required")
    private String lastName;
    @NotEmpty(message = "*Mobile is required")
    private String mobile;
    @NotEmpty(message = "*Email is required")
    private String email;
    private String contactAddress;

}
