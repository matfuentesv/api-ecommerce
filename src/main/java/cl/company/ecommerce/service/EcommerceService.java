package cl.company.ecommerce.service;

import cl.company.ecommerce.model.Customer;
import cl.company.ecommerce.model.Invoice;
import cl.company.ecommerce.model.Invoiceitem;

public interface EcommerceService {

    Invoice findCustomerInvoice(String customerId,String date);
    Customer findCustomer(String customerId);

    Invoiceitem findInvoiceItem(int id);
}
