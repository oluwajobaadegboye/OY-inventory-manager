package edu.mum.cs.inventorymanager.model;

import java.util.Date;

public abstract class Payment{
    
    private static final long serialVersionUID = 1L;
    private String paymentDate;
    private String referenceId;
    private double paymentAmount;
    private int orderId;
    private int paymentStatus;
    private int settlementStatus;
    private Date settlementDate;
    private Date paymentDateAsDate;
    private String channel;
    protected String paymentMethod;
    private String narration;
    
    public enum PaymentStatus {
        Exists(7000);
        
        public int code;
        PaymentStatus(int code){
            this.code = code;
        }
    }
    
    public abstract String getPaymentMethod(); 

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(int settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }

    public Date getPaymentDateAsDate() {
        return paymentDateAsDate;
    }

    public void setPaymentDateAsDate(Date paymentDateAsDate) {
        this.paymentDateAsDate = paymentDateAsDate;
    }


    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }
    
    
}
