package cl.company.ecommerce.model;

import java.math.BigDecimal;

public class Invoiceitem {

    private Long id;
    private String description;
    private BigDecimal unitPrice;
    private int quantity;

    public Invoiceitem(Long id, String description, BigDecimal unitPrice, int quantity) {
        this.id = id;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
