package edu.mum.cs.inventorymanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int productId;
    private String productCode;    
    private String productBarCode;
    private int productCategory;
    private String productDescription;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double productMrsp = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double productPrice = 0.0;
    private int productReorderBy;
    private double productReorderLevel;
    private String productMessage;
    private int merchantId;
    private int imageId;
    private int productTaxId;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double productTax = 0.0;
    private int taxInclusive;
    private int currencyId;
    private int unitId;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double productQuantity = 0.0;
    private String productQuantityUnit;
    private String tags;
    private String mimeType;
    private byte[] imageBinary;
    private String imagePath;
    private String productUnitName;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double unitPrice = 0.0;
    private int quantityRequested;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double productTaxAmt = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double totalAmount = 0.0;
    private String strProductLocation;
    private String strBusinessUnitName;
    private String strBusinessUnitCode;
    private int businessUnitId;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double valueOfStock = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double quantityInTransit = 0.0;
    private String merchantCode;
    private String comments;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double transferCost = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double transferQuantity = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double receivedQuantity = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double productDiscount = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double productQuantitySold = 0.0;
    @XmlJavaTypeAdapter(AmountAdapter.class)
    private Double orderQuantity = 0.0;
    private int batchId;
    private String categoryCode;
    private String categoryName;
    private String currencyCode;
    private String productType;
    private int constituentProductId;
    private String constituentProductDescription;
    private String unitName;
    private String unitType;
    private int isVirtualProduct;
    private String imageMime;
    private long parentProductId;
    private TreeMap<String, String> attributes;
    private List<Product> variants = new ArrayList<Product>();
    private int numberOfVariants;
    private Double variantPrice = 0.00;
    private Double variantQuantity = 0.00;
    private Double variantTransferCost = 0.00;
    private String customerServiceNo;
    private boolean hasVariants = false;
    private String productSerialCode = null;
    private List<ProductTracking> productTracking = new ArrayList<ProductTracking>();
    private boolean publishStoreFront;
    private Double productQuantityDelivered = 0.00;
    
    public enum ProductTracking{
        NONE(0, "None"), SERIAL_CODE(1, "Serial Code"), BATCH_CODE(2, "Batch Code"), BAR_CODE(4, "Product Barcode");  
        
        public final int id;
        public final String description;

        ProductTracking(int id, String description) {
            this.id = id;
            this.description = description;
        }
        public static final Map<Integer, ProductTracking> lookup = new HashMap<Integer, ProductTracking>();

        static {
            for (ProductTracking o : EnumSet.allOf(ProductTracking.class)) {
                lookup.put(o.id, o);
            }
        }
    }

    public String getImageMime() {
        return imageMime;
    }

    public void setImageMime(String imageMime) {
        this.imageMime = imageMime;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
    private double fixedAmount;

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getStrBusinessUnitCode() {
        return strBusinessUnitCode;
    }

    public void setStrBusinessUnitCode(String strBusinessUnitCode) {
        this.strBusinessUnitCode = strBusinessUnitCode;
    }

    public String getStrBusinessUnitName() {
        return strBusinessUnitName;
    }

    public void setStrBusinessUnitName(String strBusinessUnitName) {
        this.strBusinessUnitName = strBusinessUnitName;
    }

    public String getStrProductLocation() {
        return strProductLocation;
    }

    public void setStrProductLocation(String strProductLocation) {
        this.strProductLocation = strProductLocation;
    }

    public int getQuantityRequested() {
        return quantityRequested;
    }

    public void setQuantityRequested(int quantityRequested) {
        this.quantityRequested = quantityRequested;
    }

    public String getProductUnitName() {
        return productUnitName;
    }

    public void setProductUnitName(String productUnitName) {
        this.productUnitName = productUnitName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductReorderBy() {
        return productReorderBy;
    }

    public double getProductReorderLevel() {
        return productReorderLevel;
    }

    public String getProductMessage() {
        return productMessage;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public int getImageId() {
        return imageId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductReorderBy(int productReorderBy) {
        this.productReorderBy = productReorderBy;
    }

    public void setProductReorderLevel(double productReorderLevel) {
        this.productReorderLevel = productReorderLevel;
    }

    public void setProductMessage(String productMessage) {
        this.productMessage = productMessage;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public int getTaxInclusive() {
        return taxInclusive;
    }

    public void setTaxInclusive(int taxInclusive) {
        this.taxInclusive = taxInclusive;
    }

    public byte[] getImageBinary() {
        return imageBinary;
    }

    public void setImageBinary(byte[] imageBinary) {
        this.imageBinary = imageBinary;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public String getProductQuantityUnit() {
        return productQuantityUnit;
    }

    public void setProductQuantityUnit(String productQuantityUnit) {
        this.productQuantityUnit = productQuantityUnit;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getProductBarCode() {
        return productBarCode;
    }

    public void setProductBarCode(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public int getProductTaxId() {
        return productTaxId;
    }

    public void setProductTaxId(int productTaxId) {
        this.productTaxId = productTaxId;
    }

    public int getConstituentProductId() {
        return constituentProductId;
    }

    public void setConstituentProductId(int constituentProductId) {
        this.constituentProductId = constituentProductId;
    }

    public String getConstituentProductDescription() {
        return constituentProductDescription;
    }

    public void setConstituentProductDescription(
            String constituentProductDescription) {
        this.constituentProductDescription = constituentProductDescription;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIsVirtualProduct() {
        return isVirtualProduct;
    }

    public void setIsVirtualProduct(int isVirtualProduct) {
        this.isVirtualProduct = isVirtualProduct;
    }

    public Double getProductMrsp() {
        return productMrsp;
    }

    public void setProductMrsp(Double productMrsp) {
        this.productMrsp = productMrsp;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getProductTax() {
        return productTax;
    }

    public void setProductTax(Double productTax) {
        this.productTax = productTax;
    }

    public Double getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Double productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getProductTaxAmt() {
        return productTaxAmt;
    }

    public void setProductTaxAmt(Double productTaxAmt) {
        this.productTaxAmt = productTaxAmt;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getValueOfStock() {
        return valueOfStock;
    }

    public void setValueOfStock(Double valueOfStock) {
        this.valueOfStock = valueOfStock;
    }

    public Double getQuantityInTransit() {
        return quantityInTransit;
    }

    public void setQuantityInTransit(Double quantityInTransit) {
        this.quantityInTransit = quantityInTransit;
    }

    public Double getTransferCost() {
        return transferCost;
    }

    public void setTransferCost(Double transferCost) {
        this.transferCost = transferCost;
    }

    public Double getTransferQuantity() {
        return transferQuantity;
    }

    public void setTransferQuantity(Double transferQuantity) {
        this.transferQuantity = transferQuantity;
    }

    public Double getReceivedQuantity() {
        return receivedQuantity;
    }

    public void setReceivedQuantity(Double receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }

    public Double getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(Double productDiscount) {
        this.productDiscount = productDiscount;
    }

    public Double getProductQuantitySold() {
        return productQuantitySold;
    }

    public void setProductQuantitySold(Double productQuantitySold) {
        this.productQuantitySold = productQuantitySold;
    }

    public Double getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public long getParentProductId() {
        return parentProductId;
    }

    public void setParentProductId(long parentProductId) {
        this.parentProductId = parentProductId;
    }

    public TreeMap<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(TreeMap<String, String> attributes) {
        this.attributes = attributes;
    }

    public List<Product> getVariants() {
        return variants;
    }

    public void setVariants(List<Product> variants) {
        this.variants = variants;
    }

    public int getNumberOfVariants() {
        return variants == null ? 0 : variants.size();
    }

    public void setNumberOfVariants(int numberOfVariants) {
        this.numberOfVariants = numberOfVariants;
    }

    public Double getVariantPrice() {
        return variantPrice;
    }

    public void setVariantPrice(Double variantPrice) {
        this.variantPrice = variantPrice;
    }

    public Double getVariantQuantity() {
        return variantQuantity;
    }

    public void setVariantQuantity(Double variantQuantity) {
        this.variantQuantity = variantQuantity;
    }

    public Double getVariantTransferCost() {
        return variantTransferCost;
    }

    public void setVariantTransferCost(Double variantTransferCost) {
        this.variantTransferCost = variantTransferCost;
    }

    public String getCustomerServiceNo() {
        return customerServiceNo;
    }

    public void setCustomerServiceNo(String customerServiceNo) {
        this.customerServiceNo = customerServiceNo;
    }

    public boolean isHasVariants() {
        return hasVariants;
    }

    public void setHasVariants(boolean hasVariants) {
        this.hasVariants = hasVariants;
    }

    public String getProductSerialCode() {
        return productSerialCode;
    }

    public void setProductSerialCode(String productSerialCode) {
        this.productSerialCode = productSerialCode;
    }

    public List<ProductTracking> getProductTracking() {
        return productTracking;
    }

    public void setProductTracking(List<ProductTracking> productTracking) {
        this.productTracking = productTracking;
    }

    public boolean isPublishStoreFront() {
        return publishStoreFront;
    }

    public void setPublishStoreFront(boolean publishStoreFront) {
        this.publishStoreFront = publishStoreFront;
    }

    public Double getProductQuantityDelivered() {
        return productQuantityDelivered;
    }

    public void setProductQuantityDelivered(Double productQuantityDelivered) {
        this.productQuantityDelivered = productQuantityDelivered;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }            
                    
}
