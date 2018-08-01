package edu.mum.cs.inventorymanager.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int customerId;
    private String customerCode;
    private String alternateCustomerCode;
    private int merchantId;
    private int customerCategoryId;
    private String alternateCustomerCodeTwo;
    private String cardNo;
    private double value;
    private String dateModified;
    private String birthDate;
    private String customerCategoryName;
    private String merchantName;
    private int generateCode;
    private CustomerCategory customerCategory;
    private String productCode;    
    private String syncUpdated;
    private String accountNumber;
    private double availableBalance;
    private String walletStatus;
    
    public String getCustomerCategoryName() {
        return customerCategoryName;
    }

    public void setCustomerCategoryName(String customerCategoryName) {
        this.customerCategoryName = customerCategoryName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getAlternateCustomerCode() {
        return alternateCustomerCode;
    }

    public void setAlternateCustomerCode(String alternateCustomerCode) {
        this.alternateCustomerCode = alternateCustomerCode;
    }
    
    public int getMerchantId() {
        return merchantId;
    }

    public int getCustomerCategoryId() {
        return customerCategoryId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public void setCustomerCategoryId(int customerCategoryId) {
        this.customerCategoryId = customerCategoryId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getGenerateCode() {
        return generateCode;
    }

    public void setGenerateCode(int generateCode) {
        this.generateCode = generateCode;
    }

    public CustomerCategory getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(CustomerCategory customerCategory) {
        this.customerCategory = customerCategory;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }    

    public String getAlternateCustomerCodeTwo() {
        return alternateCustomerCodeTwo;
    }

    public void setAlternateCustomerCodeTwo(String alternateCustomerCodeTwo) {
        this.alternateCustomerCodeTwo = alternateCustomerCodeTwo;
    }    

    public String getSyncUpdated() {
        return syncUpdated;
    }

    public void setSyncUpdated(String syncUpdated) {
        this.syncUpdated = syncUpdated;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getWalletStatus() {
        return walletStatus;
    }

    public void setWalletStatus(String walletStatus) {
        this.walletStatus = walletStatus;
    }
        
}
