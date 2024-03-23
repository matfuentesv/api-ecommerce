package cl.company.ecommerce.model;

import java.util.List;

public class InvoiceCustomer {
    private Customer customer;
    private List<Invoiceitem>invoiceitems;
    private String date;

    public Customer getCustomer() {
        return customer;
    }

    public InvoiceCustomer setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public List<Invoiceitem> getInvoiceitems() {
        return invoiceitems;
    }

    public InvoiceCustomer setInvoiceitems(List<Invoiceitem> invoiceitems) {
        this.invoiceitems = invoiceitems;
        return this;
    }

    public String getDate() {
        return date;
    }

    public InvoiceCustomer setDate(String date) {
        this.date = date;
        return this;
    }
}
