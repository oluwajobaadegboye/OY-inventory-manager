package edu.mum.cs.inventorymanager.model;

import dms.util.AmountAdapter;
import dms.valueobject.PaymentType;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "paymentCash")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentCash extends Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    private int paymentCashId;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double cashPaid =0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double cashChange =0.0;
    private boolean cashStatus = false;

    public int getPaymentCashId() {
        return paymentCashId;
    }

    public void setPaymentCashId(int paymentCashId) {
        this.paymentCashId = paymentCashId;
    }

    public boolean isCashStatus() {
        return cashStatus;
    }

    public void setCashStatus(boolean cashStatus) {
        this.cashStatus = cashStatus;
    }

    public Double getCashPaid() {
        return cashPaid;
    }

    public void setCashPaid(Double cashPaid) {
        this.cashPaid = cashPaid;
    }

    public Double getCashChange() {
        return cashChange;
    }

    public void setCashChange(Double cashChange) {
        this.cashChange = cashChange;
    }
    
    @Override
    public String getPaymentMethod() {
        return PaymentType.CASH_PAYMENT.paymentCode;
    }
    
    

}
