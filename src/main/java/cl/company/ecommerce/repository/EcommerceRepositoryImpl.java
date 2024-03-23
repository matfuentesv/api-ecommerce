package cl.company.ecommerce.repository;

import cl.company.ecommerce.model.Customer;
import cl.company.ecommerce.model.InvoiceCustomer;
import cl.company.ecommerce.model.Invoiceitem;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class EcommerceRepositoryImpl implements EcommerceRepository{


    @Override
    public List<InvoiceCustomer> dataSourceInvoceCustomer() {

        final Customer customer1 = new Customer()
                .setId("frojas")
                .setName("Francica")
                .setLastName("Rojas")
                .setAge(28)
                .setPhone("+56225830430")
                .setAddress("Calle 123");

        final Customer customer2 = new Customer()
                .setId("jperez")
                .setName("María")
                .setLastName("Perez")
                .setAge(35)
                .setPhone("56225837890")
                .setAddress("Avenida 456");

        final Customer customer3 = new Customer()
                .setId("mgonzalez")
                .setName("Juan")
                .setLastName("González")
                .setAge(42)
                .setPhone("56225831245")
                .setAddress("Calle Principal");



        final List<Invoiceitem> items1 = Arrays.asList(
                new Invoiceitem(1L, "Producto 1", new BigDecimal("10.000"), 5),
                new Invoiceitem(2L, "Producto 2", new BigDecimal("10.000"), 5)
        );

        final List<Invoiceitem> items2 = Arrays.asList(
                new Invoiceitem(1L, "Producto 3", new BigDecimal("100.000"), 5),
                new Invoiceitem(2L, "Producto 4", new BigDecimal("20.000"), 5)
        );

        final List<Invoiceitem> items3 = Arrays.asList(
                new Invoiceitem(1L, "Producto 5", new BigDecimal("10.000"), 5),
                new Invoiceitem(2L, "Producto 6", new BigDecimal("5.000"), 5)
        );

        InvoiceCustomer invoiceCustomer1 = new InvoiceCustomer()
                .setCustomer(customer1)
                .setInvoiceitems(items1)
                .setDate("2024-03-23 14:25");

        InvoiceCustomer invoiceCustomer2 = new InvoiceCustomer()
                .setCustomer(customer2)
                .setInvoiceitems(items2)
                .setDate("2024-03-21 14:25");

        InvoiceCustomer invoiceCustomer3 = new InvoiceCustomer()
                .setCustomer(customer3)
                .setInvoiceitems(items3)
                .setDate("2024-03-22 14:25");

        return new ArrayList<>(Arrays.asList(invoiceCustomer1,invoiceCustomer2,invoiceCustomer3));
    }
}
