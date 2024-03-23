package cl.company.ecommerce.model;

public class InvoiceCustomer {
    private Customer customer;
    private Invoiceitem invoiceitem;

    public Customer getCustomer() {
        return customer;
    }

    public InvoiceCustomer setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public Invoiceitem getInvoiceitem() {
        return invoiceitem;
    }

    public InvoiceCustomer setInvoiceitem(Invoiceitem invoiceitem) {
        this.invoiceitem = invoiceitem;
        return this;
    }
}
