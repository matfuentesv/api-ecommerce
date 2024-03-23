package cl.company.ecommerce.model;

import java.math.BigDecimal;

public class Invoice {


    private Customer customer;
    private Invoiceitem invoiceitem;
    private BigDecimal total;
    private BigDecimal discount;
    private BigDecimal totalWithDiscount;


    public Invoice(){}
    public Invoice(Customer customer, Invoiceitem invoiceitem, BigDecimal total, BigDecimal discount, BigDecimal totalWithDiscount) {
        this.customer = customer;
        this.invoiceitem = invoiceitem;
        this.total = total;
        this.discount = discount;
        this.totalWithDiscount = totalWithDiscount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Invoice setCustomer(Customer customer) {
        this.customer = customer;
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

    public Invoiceitem getInvoiceitem() {
        return invoiceitem;
    }

    public Invoice setInvoiceitem(Invoiceitem invoiceitem) {
        this.invoiceitem = invoiceitem;
        return this;
    }
}
