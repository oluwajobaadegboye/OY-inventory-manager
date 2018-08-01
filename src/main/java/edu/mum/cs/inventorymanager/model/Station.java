package edu.mum.cs.inventorymanager.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class Station implements Serializable {

    private static final long serialVersionUID = 1L;
    private int[] id;
    private int stationId;
    private int businessUnitId;
    private String stationName;
    private String terminalId;
    private int merchantId;
    private String customerHeader;
    private String customerFooter;
    private String storeHeader;
    private String storeFooter;
    private String receiptHeader;
    private String receiptFooter;
    private HashMap<String, String> stationConfiguration;
    private String customerImage;
    private String receiptImage;
    private String storeImage;
    private int receiptLogoId;
    private int defaultConfiguration;
    private String lineDisplayMessage;
    private String defaultCurrency;
    private String cardAcceptorId;
    private String merchant;
    private String locationName;
    private String businessUnitName;
    private Date lastCallTime;
    private int stationStatus;
    private int locationId;
    private String defaultCurrencyName;
    private int noOfCompletedTrxns;
    private int noOfCompletedPrepaidTrxns;
    private double totalCashInCurrentShift;
    private double totalCashToday;
    private String username;
    private String dealerCode;
    private String deviceNr;
    private String masterKey;
    private String sessionKey;
    private String stationType;
    private boolean defaultStation;
    private boolean stockingStation;

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public double getTotalCashInCurrentShift() {
        return totalCashInCurrentShift;
    }

    public double getTotalCashToday() {
        return totalCashToday;
    }

    public String getUsername() {
        return username;
    }

    public void setTotalCashInCurrentShift(double totalCashInCurrentShift) {
        this.totalCashInCurrentShift = totalCashInCurrentShift;
    }

    public void setTotalCashToday(double totalCashToday) {
        this.totalCashToday = totalCashToday;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getNoOfCompletedPrepaidTrxns() {
        return noOfCompletedPrepaidTrxns;
    }

    public int getNoOfCompletedTrxns() {
        return noOfCompletedTrxns;
    }

    public void setNoOfCompletedPrepaidTrxns(int noOfCompletedPrepaidTrxns) {
        this.noOfCompletedPrepaidTrxns = noOfCompletedPrepaidTrxns;
    }

    public void setNoOfCompletedTrxns(int noOfCompletedTrxns) {
        this.noOfCompletedTrxns = noOfCompletedTrxns;
    }

    public String getDefaultCurrencyName() {
        return defaultCurrencyName;
    }

    public void setDefaultCurrencyName(String defaultCurrencyName) {
        this.defaultCurrencyName = defaultCurrencyName;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getCardAcceptorId() {
        return cardAcceptorId;
    }

    public void setCardAcceptorId(String cardAcceptorId) {
        this.cardAcceptorId = cardAcceptorId;
    }

    public String getCustomerFooter() {
        return customerFooter;
    }

    public void setCustomerFooter(String customerFooter) {
        this.customerFooter = customerFooter;
    }

    public String getCustomerHeader() {
        return customerHeader;
    }

    public void setCustomerHeader(String customerHeader) {
        this.customerHeader = customerHeader;
    }

    public String getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(String customerImage) {
        this.customerImage = customerImage;
    }

    public int getDefaultConfiguration() {
        return defaultConfiguration;
    }

    public void setDefaultConfiguration(int defaultConfiguration) {
        this.defaultConfiguration = defaultConfiguration;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public String getLineDisplayMessage() {
        return lineDisplayMessage;
    }

    public void setLineDisplayMessage(String lineDisplayMessage) {
        this.lineDisplayMessage = lineDisplayMessage;
    }

    public String getReceiptFooter() {
        return receiptFooter;
    }

    public void setReceiptFooter(String receiptFooter) {
        this.receiptFooter = receiptFooter;
    }

    public String getReceiptHeader() {
        return receiptHeader;
    }

    public void setReceiptHeader(String receiptHeader) {
        this.receiptHeader = receiptHeader;
    }

    public String getReceiptImage() {
        return receiptImage;
    }

    public void setReceiptImage(String receiptImage) {
        this.receiptImage = receiptImage;
    }

    public HashMap<String, String> getStationConfiguration() {
        return stationConfiguration;
    }

    public void setStationConfiguration(HashMap<String, String> stationConfiguration) {
        this.stationConfiguration = stationConfiguration;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStoreFooter() {
        return storeFooter;
    }

    public void setStoreFooter(String storeFooter) {
        this.storeFooter = storeFooter;
    }

    public String getStoreHeader() {
        return storeHeader;
    }

    public void setStoreHeader(String storeHeader) {
        this.storeHeader = storeHeader;
    }

    public String getStoreImage() {
        return storeImage;
    }

    public void setStoreImage(String storeImage) {
        this.storeImage = storeImage;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }
    private String receiptLogoTag;
    private String receiptLogoMimeType;
    private byte[] receiptLogoBinary;

    public byte[] getReceiptLogoBinary() {
        return receiptLogoBinary;
    }

    public void setReceiptLogoBinary(byte[] receiptLogoBinary) {
        this.receiptLogoBinary = receiptLogoBinary;
    }

    public String getReceiptLogoMimeType() {
        return receiptLogoMimeType;
    }

    public void setReceiptLogoMimeType(String receiptLogoMimeType) {
        this.receiptLogoMimeType = receiptLogoMimeType;
    }

    public String getReceiptLogoTag() {
        return receiptLogoTag;
    }

    public void setReceiptLogoTag(String receiptLogoTag) {
        this.receiptLogoTag = receiptLogoTag;
    }

    public int getReceiptLogoId() {
        return receiptLogoId;
    }

    public void setReceiptLogoId(int receiptLogoId) {
        this.receiptLogoId = receiptLogoId;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public Date getLastCallTime() {
        return lastCallTime;
    }

    public void setLastCallTime(Date lastCallTime) {
        this.lastCallTime = lastCallTime;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public int getStationStatus() {
        return stationStatus;
    }

    public void setStationStatus(int stationStatus) {
        this.stationStatus = stationStatus;
    }

    public String getDeviceNr() {
        return deviceNr;
    }

    public void setDeviceNr(String deviceNr) {
        this.deviceNr = deviceNr;
    }

    public String getMasterKey() {
        return masterKey;
    }

    public void setMasterKey(String masterKey) {
        this.masterKey = masterKey;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getSessionKey() {
        return this.sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public boolean isDefaultStation() {
        return this.defaultStation;
    }

    public void setDefaultStation(boolean defaultStation) {
        this.defaultStation = defaultStation;
    }

    public boolean isStockingStation() {
        return stockingStation;
    }

    public void setStockingStation(boolean stockingStation) {
        this.stockingStation = stockingStation;
    }
}
