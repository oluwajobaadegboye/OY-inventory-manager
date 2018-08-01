package edu.mum.cs.inventorymanager.model;

public enum PaymentType {
    CASH_PAYMENT("Cash Payment", "Cash"),
    CHEQUE_PAYMENT("Cheque Payment","Check"),
    CARD_PAYMENT("Card Payment","Credit/Debit"),
    OTHER_CARD_PAYMENT("Other Card Payment","Other Card"),
    DMS_CREDIT("Dms Credit", "DmsCredit"),
    WALLET("Wallet Payment", "Wallet");

    public final String paymentName;
    public final String paymentCode;

    PaymentType(String name, String code){
        this.paymentName = name;
        this.paymentCode = code;
    }
}