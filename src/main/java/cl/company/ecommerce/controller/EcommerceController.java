package cl.company.ecommerce.controller;

import cl.company.ecommerce.model.Customer;
import cl.company.ecommerce.model.Invoice;
import cl.company.ecommerce.model.Invoiceitem;
import cl.company.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;


    @GetMapping("/findCustomerInvoice/{id}/{date}")
    public ResponseEntity<Invoice>findCustomerInvoice(@PathVariable String id,@PathVariable String date) {
            Invoice factura = ecommerceService.findCustomerInvoice(id,date);
            return ResponseEntity.ok(factura);
    }

    @GetMapping("/findCustomer/{customerId}")
    public ResponseEntity<Customer>findCustomerId(@PathVariable String customerId) {
        Customer customer = ecommerceService.findCustomer(customerId);
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/findInvoiceItem/{id}")
    public ResponseEntity<Invoiceitem>findInvoiceItem(@PathVariable int id) {
        Invoiceitem invoiceitem = ecommerceService.findInvoiceItem(id);
        return ResponseEntity.ok(invoiceitem);
    }

}
