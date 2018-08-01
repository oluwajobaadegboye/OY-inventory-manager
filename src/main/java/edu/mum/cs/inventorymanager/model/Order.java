package edu.mum.cs.inventorymanager.model;

import dms.util.AmountAdapter;
import dms.util.DateAdapter;
import dms.util.OrderStatus;
import dms.valueobject.OrderType;
import dms.valueobject.ServiceType;
import dms.webservices.model.SynchronizationRequest;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(Order.class);
    private static final long serialVersionUID = 0L;

    public Order() {
    }
    private int id;
    private int orderId;
    @NotEmpty(message = "{NotEmpty.ordercode}", groups = {SynchronizationRequest.UpdateOrderRequest.class})
    private String orderCode;
    private String invoiceNumber;
    @NotEmpty(message = "{NotEmpty.order.paymentmethod}", groups = {SynchronizationRequest.UpdateOrderRequest.class})
    private String paymentMethod;
    private int paymentId;
    private int userId;
    private int stationId;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date datePurchased = new Date();
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double orderTotal = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double orderDiscount = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double orderTax = 0.0;
    private String orderTaxWaived;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double orderSubTotal = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double amtPaid = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double amtDue = 0.0;
    private int orderStatus;
    private int paymentStatus;
    private int synch;
    private int customerId;
    private String customerCode;
    private String orderDate;
    private String salesUserName;
    private String salesStation;
    private double orderServiceCharge;
    private String orderDelivered;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date transactionDate;
    private String orderAmountDue;
    private String orderTotalAmountPaid;
    private String description;
    private String comments;
    private String chequeNo;
    private String shiftCode;
    private String shiftIdentifier;
    private int orderType;
    private int locationId;
    private int orderComplete;
    private String currencyCode;
    private Product[] product;
    private PaymentCash[] cashPayment;
    private PaymentCheque[] checkPayment;
    private PaymentCard[] creditPayment;
    private PaymentOtherCard[] otherCardPayment;
    private PaymentWallet[] walletPayment;
    private String location;
    private String locationAddress1;
    private String locationCity;
    private String locationState;
    private String businessUnitName;
    private String businessUnitCode;
    private String salesmanCardNo;
    private String dealerCode;
    private String dealerName;
    private String contactAddress;
    private int dealerId;
    private int merchantId;
    private String merchantCode;
    private String merchantName;
    private String merchantEmail;
    private String merchantMobilePhone;
    private double totalAmount;
    private String transactionDescription;
    private String productName;
    private int salesManId;
    private String salesManName;
    private Date lastUpdatedOn;
    private String staffId;
    private String terminalId;
    private String cbnCode;
    private String corporateName;
    private String pumpNumber;
    private String hoseNumber;
    private String initialTotalizer;
    private String finalTotalizer;
    private Customer customer;
    private String orderUpdatedBy;
    private int allowNegativeInventory;
    private int invoiceOnly;
    private int industryId;
    private boolean orderValidForRequest;
    private String eProductResponseData;
    private String remoteHostRespCode;
    private String remoteHostRespMsg;
    private String remoteHostResp;
    private int serviceType;
    private Date syncDate;
    private Date orderCompletionDate;
    private int settlementStatus;
    private int nrTries;
    private String dueDate;
    private double consumptionTax;
    private double throughput;
    private String trxnRef;
    private String lastTrxnRef;
    private Date deliveryDate;
    private int fulfillingStationId;
    private int fulfillingLocationId;
    private String lastUpdatedBy;
    private String alternateEmailRecipient;
    private String virtualOrderCode;
    private String remoteCustomerReference;
    private Date expiryDate;    

    public String getSettlementStatusDesc() {
        return Order.SettlementStatus.lookup.get(this.settlementStatus).statusDescription;
    }

    public int getInvoiceOnly() {
        return invoiceOnly;
    }

    public void setInvoiceOnly(int invoiceOnly) {
        this.invoiceOnly = invoiceOnly;
    }

    public String getOrderStatusDesc() {
        return OrderStatus.lookup.get(new Integer(this.orderStatus)).orderStatusDescription;
    }

    public String getOrderUpdatedBy() {
        return orderUpdatedBy;
    }

    public void setOrderUpdatedBy(String orderUpdatedBy) {
        this.orderUpdatedBy = orderUpdatedBy;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getSalesManName() {
        return salesManName;
    }

    public void setSalesManName(String salesManName) {
        this.salesManName = salesManName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getSalesmanCardNo() {
        return salesmanCardNo;
    }

    public void setSalesmanCardNo(String salesmanCardNo) {
        this.salesmanCardNo = salesmanCardNo;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public void setLocation() {
        this.location = this.getLocationAddress1() + ", " + this.getLocationCity() + ", " + this.getLocationState();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getSynch() {
        return synch;
    }

    public void setSynch(int synch) {
        this.synch = synch;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getSalesUserName() {
        return salesUserName;
    }

    public void setSalesUserName(String salesUserName) {
        this.salesUserName = salesUserName;
    }

    public String getSalesStation() {
        return salesStation;
    }

    public void setSalesStation(String salesStation) {
        this.salesStation = salesStation;
    }

    public String getOrderTaxWaived() {
        return orderTaxWaived;
    }

    public void setOrderTaxWaived(String orderTaxWaived) {
        this.orderTaxWaived = orderTaxWaived;
    }

    public String getOrderDelivered() {
        return orderDelivered;
    }

    public void setOrderDelivered(String orderDelivered) {
        this.orderDelivered = orderDelivered;
    }

    public String getLocation() {
        return location;
    }

    public String getLocationAddress1() {
        return locationAddress1;
    }

    public void setLocationAddress1(String locationAddress1) {
        this.locationAddress1 = locationAddress1;
    }

    public String getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    public String getLocationState() {
        return locationState;
    }

    public void setLocationState(String locationState) {
        this.locationState = locationState;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public int getSalesManId() {
        return salesManId;
    }

    public void setSalesManId(int salesManId) {
        this.salesManId = salesManId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getOrderAmountDue() {
        return orderAmountDue;
    }

    public void setOrderAmountDue(String orderAmountDue) {
        this.orderAmountDue = orderAmountDue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getOrderTotalAmountPaid() {
        return orderTotalAmountPaid;
    }

    public void setOrderTotalAmountPaid(String orderTotalAmountPaid) {
        this.orderTotalAmountPaid = orderTotalAmountPaid;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCbnCode() {
        return cbnCode;
    }

    public void setCbnCode(String cbnCode) {
        this.cbnCode = cbnCode;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getShiftCode() {
        return shiftCode;
    }

    public void setShiftCode(String shiftCode) {
        this.shiftCode = shiftCode;
    }

    public String getFinalTotalizer() {
        return finalTotalizer;
    }

    public void setFinalTotalizer(String finalTotalizer) {
        this.finalTotalizer = finalTotalizer;
    }

    public String getHoseNumber() {
        return hoseNumber;
    }

    public void setHoseNumber(String hoseNumber) {
        this.hoseNumber = hoseNumber;
    }

    public String getInitialTotalizer() {
        return initialTotalizer;
    }

    public void setInitialTotalizer(String initialTotalizer) {
        this.initialTotalizer = initialTotalizer;
    }

    public String getPumpNumber() {
        return pumpNumber;
    }

    public void setPumpNumber(String pumpNumber) {
        this.pumpNumber = pumpNumber;
    }

    public String getShiftIdentifier() {
        return shiftIdentifier;
    }

    public void setShiftIdentifier(String shiftIdentifier) {
        this.shiftIdentifier = shiftIdentifier;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getOrderComplete() {
        return orderComplete;
    }

    public void setOrderComplete(int orderComplete) {
        this.orderComplete = orderComplete;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getAllowNegativeInventory() {
        return allowNegativeInventory;
    }

    public void setAllowNegativeInventory(int allowNegativeInventory) {
        this.allowNegativeInventory = allowNegativeInventory;
    }

    public boolean isOrderValidForRequest() {
        return orderValidForRequest;
    }

    public void setOrderValidForRequest(boolean orderValidForRequest) {
        this.orderValidForRequest = orderValidForRequest;
    }

    public String geteProductResponseData() {
        return eProductResponseData;
    }

    public void seteProductResponseData(String eProductResponseData) {
        this.eProductResponseData = eProductResponseData;
    }

    public String getRemoteHostRespCode() {
        return remoteHostRespCode;
    }

    public void setRemoteHostRespCode(String remoteHostRespCode) {
        this.remoteHostRespCode = remoteHostRespCode;
    }

    public String getRemoteHostRespMsg() {
        return remoteHostRespMsg;
    }

    public void setRemoteHostRespMsg(String remoteHostRespMsg) {
        this.remoteHostRespMsg = remoteHostRespMsg;
    }

    public PaymentCash[] getCashPayment() {
        return cashPayment;
    }

    public void setCashPayment(PaymentCash[] cashPayment) {
        this.cashPayment = cashPayment;
    }

    public PaymentCheque[] getCheckPayment() {
        return checkPayment;
    }

    public void setCheckPayment(PaymentCheque[] checkPayment) {
        this.checkPayment = checkPayment;
    }

    public PaymentCard[] getCreditPayment() {
        return creditPayment;
    }

    public void setCreditPayment(PaymentCard[] creditPayment) {
        this.creditPayment = creditPayment;
    }

    public PaymentOtherCard[] getOtherCardPayment() {
        return otherCardPayment;
    }

    public void setOtherCardPayment(PaymentOtherCard[] otherCardPayment) {
        this.otherCardPayment = otherCardPayment;
    }

    public PaymentWallet[] getWalletPayment() {
        return walletPayment;
    }

    public void setWalletPayment(PaymentWallet[] walletPayment) {
        this.walletPayment = walletPayment;
    }
    
    

    public String getRemoteHostResp() {
        remoteHostResp = (remoteHostRespCode == null ? "" : remoteHostRespCode) + remoteHostRespMsg == null ? "" : remoteHostRespMsg;
        return remoteHostResp == null || remoteHostResp.equals("") ? "N/A" : remoteHostResp;
    }

    public int getId() {
        id = orderId;
        return id;
    }

    public int getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public String getOrderTypeDesc() {
        return OrderType.lookup.get(new Integer(this.orderType)).orderTypeDescription;
    }

    public String getServiceTypeDesc() {
        return ServiceType.lookup.get(new Integer(this.serviceType)).serviceTypeDescription;
    }

    public Date getSyncDate() {
        return this.syncDate;
    }

    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
    }

    public Date getOrderCompletionDate() {
        return this.orderCompletionDate;
    }

    public void setOrderCompletionDate(Date orderCompletionDate) {
        this.orderCompletionDate = orderCompletionDate;
    }

    public int getSettlementStatus() {
        return this.settlementStatus;
    }

    public void setSettlementStatus(int settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public int getNrTries() {
        return this.nrTries;
    }

    public void setNrTries(int nrTries) {
        this.nrTries = nrTries;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getConsumptionTax() {
        return consumptionTax;
    }

    public void setConsumptionTax(double consumptionTax) {
        this.consumptionTax = consumptionTax;
    }

    public String getBusinessUnitCode() {
        return this.businessUnitCode;
    }

    public void setBusinessUnitCode(String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }

    public int getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public static enum SettlementStatus {

        PENDING(0, "Pending"),
        SETTLED(1, "Settled");
        public final int statusCode;
        public final String statusDescription;

        SettlementStatus(int id, String desc) {
            this.statusCode = id;
            this.statusDescription = desc;
        }
        public static final Map<Integer, SettlementStatus> lookup = new HashMap<Integer, SettlementStatus>();

        static {
            for (SettlementStatus o : EnumSet.allOf(SettlementStatus.class)) {
                lookup.put(o.statusCode, o);
            }
        }
    }

    public double getThroughput() {
        return this.throughput;
    }

    public void setThroughput(double throughput) {
        this.throughput = throughput;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Double getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(Double orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    public Double getOrderTax() {
        return orderTax;
    }

    public void setOrderTax(Double orderTax) {
        this.orderTax = orderTax;
    }

    public Double getOrderSubTotal() {
        return orderSubTotal;
    }

    public void setOrderSubTotal(Double orderSubTotal) {
        this.orderSubTotal = orderSubTotal;
    }

    public Double getAmtPaid() {
        return amtPaid;
    }

    public void setAmtPaid(Double amtPaid) {
        this.amtPaid = amtPaid;
    }

    public Double getAmtDue() {
        return amtDue;
    }

    public void setAmtDue(Double amtDue) {
        this.amtDue = amtDue;
    }

    public double getOrderServiceCharge() {
        return orderServiceCharge;
    }

    public void setOrderServiceCharge(double orderServiceCharge) {
        this.orderServiceCharge = orderServiceCharge;
    }

    public Date getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(Date datePurchased) {
        this.datePurchased = datePurchased;
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

    public String getTrxnRef() {
        return trxnRef;
    }

    public void setTrxnRef(String trxnRef) {
        this.trxnRef = trxnRef;
    }

    public String getLastTrxnRef() {
        return lastTrxnRef;
    }

    public void setLastTrxnRef(String lastTrxnRef) {
        this.lastTrxnRef = lastTrxnRef;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getFulfillingStationId() {
        return fulfillingStationId;
    }

    public void setFulfillingStationId(int fulfillingStationId) {
        this.fulfillingStationId = fulfillingStationId;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getAlternateEmailRecipient() {
        return alternateEmailRecipient;
    }

    public void setAlternateEmailRecipient(String alternateEmailRecipient) {
        this.alternateEmailRecipient = alternateEmailRecipient;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public String getMerchantMobilePhone() {
        return merchantMobilePhone;
    }

    public void setMerchantMobilePhone(String merchantMobilePhone) {
        this.merchantMobilePhone = merchantMobilePhone;
    }

    public int getFulfillingLocationId() {
        return fulfillingLocationId;
    }

    public void setFulfillingLocationId(int fulfillingLocationId) {
        this.fulfillingLocationId = fulfillingLocationId;
    }

    public int getIndustryId() {
        return industryId;
    }

    public void setIndustryId(int industryId) {
        this.industryId = industryId;
    }

    public String getVirtualOrderCode() {
        return virtualOrderCode;
    }

    public void setVirtualOrderCode(String virtualOrderCode) {
        this.virtualOrderCode = virtualOrderCode;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }  

    public String getRemoteCustomerReference() {
        return remoteCustomerReference;
    }

    public void setRemoteCustomerReference(String remoteCustomerReference) {
        this.remoteCustomerReference = remoteCustomerReference;
    }
    
}
