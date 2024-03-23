package cl.company.ecommerce.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class Invoice {


    private Customer customer;
    private List<Invoiceitem> items;
    private BigDecimal total;
    private BigDecimal discount;
    private BigDecimal totalWithDiscount;
    private String date;


    public Invoice(){}
    public Invoice(Customer customer, List<Invoiceitem> items, BigDecimal total, BigDecimal discount,BigDecimal totalWithDiscount,String date) {
        this.customer = customer;
        this.items = items;
        this.total = total;
        this.discount = discount;
        this.totalWithDiscount = totalWithDiscount;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Invoice setCustomer(Customer customer) {
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

    public String getDate() {
        return date;
    }

    public Invoice setDate(String date) {
        this.date = date;
        return this;
    }
}
