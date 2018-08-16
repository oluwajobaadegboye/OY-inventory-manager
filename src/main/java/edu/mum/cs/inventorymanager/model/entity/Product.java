package edu.mum.cs.inventorymanager.model.entity;


import edu.mum.cs.inventorymanager.model.dto.ProductDTO;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double costPrice;
    private double sellingPrice;
    private int quantity;
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "merchantId")
    private Merchant merchant;

    public Product() {
    }

    public Product(String name, double costPrice, double sellingPrice, int quantity, String status, Merchant merchant) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
        this.status = status;
        this.merchant = merchant;
    }

    public Product update(ProductDTO productDTO) {
        name = productDTO.getName();
        costPrice = productDTO.getCostPrice();
        sellingPrice = productDTO.getSellingPrice();
        quantity = productDTO.getQuantity();
        status = productDTO.getStatus();
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", costPrice=" + costPrice +
                ", sellingPrice=" + sellingPrice +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                ", merchant=" + merchant +
                '}';
    }
}
