package edu.mum.cs.inventorymanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(Order.class);
    private static final long serialVersionUID = 0L;

    public Order() {
    }

    private int orderId;
    private String orderCode;
    private String invoiceNumber;
     private String paymentMethod;
    private int paymentId;
    private int userId;
    private int terminalId;
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
    private String salesUserName;
    private String salesStation;
    private int locationId;
    private Product[] product;
    private PaymentCash[] cashPayment;
    private Location location;
    private Merchant merchant;

    public static Logger getLogger() {
        return logger;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(int terminalId) {
        this.terminalId = terminalId;
    }

    public Date getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(Date datePurchased) {
        this.datePurchased = datePurchased;
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

    public String getOrderTaxWaived() {
        return orderTaxWaived;
    }

    public void setOrderTaxWaived(String orderTaxWaived) {
        this.orderTaxWaived = orderTaxWaived;
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

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public PaymentCash[] getCashPayment() {
        return cashPayment;
    }

    public void setCashPayment(PaymentCash[] cashPayment) {
        this.cashPayment = cashPayment;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }
}
