package cl.company.ecommerce.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Invoice {

    private Long id;
    private Optional<Customer> customer;
    private List<Invoiceitem> items;
    private BigDecimal total;
    private BigDecimal discount;
    private BigDecimal totalWithDiscount;


    public Invoice(){}
    public Invoice(Long id, Optional<Customer> customer, List<Invoiceitem> items, BigDecimal total, BigDecimal discount) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.total = total;
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public Invoice setId(Long id) {
        this.id = id;
        return this;
    }

    public Optional<Customer> getCustomer() {
        return customer;
    }

    public Invoice setCustomer(Optional<Customer> customer) {
        this.customer = customer;
        return this;
    }

    public List<Invoiceitem> getItems() {
        return items;
    }

    public Invoice setItems(List<Invoiceitem> items) {
        this.items = items;
        return this;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Invoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public Invoice setDiscount(BigDecimal discount) {
        this.discount = discount;
        return this;
    }

    public BigDecimal getTotalWithDiscount() {
        return totalWithDiscount;
    }

    public Invoice setTotalWithDiscount(BigDecimal totalWithDiscount) {
        this.totalWithDiscount = totalWithDiscount;
        return this;
    }
}
