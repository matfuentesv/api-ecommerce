package cl.company.ecommerce.repository;

import cl.company.ecommerce.model.*;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class EcommerceRepositoryImpl implements EcommerceRepository{


    @Override
    public List<InvoiceCustomer> dataSourceInvoceCustomer() {

        final List<Roles>rolesList = new ArrayList<>(Arrays.asList(new Roles(1,"ADMIN"),
                                                                   new Roles(2,"USERR")));
        final List<Roles>rolesList2 = new ArrayList<>(Arrays.asList(new Roles(1,"COMERCIAL")));
        final Customer customer1 = new Customer()
                .setId("frojas")
                .setName("Francica")
                .setLastName("Rojas")
                .setAge(28)
                .setPhone("+56225830430")
                .setAddress("Calle 123")
                .setRoles(rolesList);

        final Customer customer2 = new Customer()
                .setId("jperez")
                .setName("María")
                .setLastName("Perez")
                .setAge(35)
                .setPhone("56225837890")
                .setAddress("Avenida 456")
                .setRoles(new ArrayList<>());

        final Customer customer3 = new Customer()
                .setId("mgonzalez")
                .setName("Juan")
                .setLastName("González")
                .setAge(42)
                .setPhone("56225831245")
                .setAddress("Calle Principal");

        final Customer customer4 = new Customer()
                .setId("mgonzalez")
                .setName("Juan")
                .setLastName("González")
                .setAge(42)
                .setPhone("56225831245")
                .setAddress("Calle Principal")
                .setRoles(rolesList2);



        final List<Product> items1 = Arrays.asList(
                new Product(1L, "Audifonos", new BigDecimal("10000"), 5),
                new Product(2L, "Mouse", new BigDecimal("10000"), 5)
        );

        final List<Product> items2 = Arrays.asList(
                new Product(1L, "Monitor", new BigDecimal("100000"), 5),
                new Product(2L, "PC", new BigDecimal("550000"), 1)
        );

        final List<Product> items3 = Arrays.asList(
                new Product(1L, "Celular", new BigDecimal("100000"), 5),
                new Product(2L, "Reloj Inteligente", new BigDecimal("600000"), 1)
        );


        final Invoiceitem invoiceitem1 = new Invoiceitem()
                .setId(1)
                .setDate("2024-03-23")
                .setProducts(items1);

        final Invoiceitem invoiceitem2 = new Invoiceitem()
                .setId(2)
                .setDate("2024-03-23")
                .setProducts(items2);

        final Invoiceitem invoiceitem3 = new Invoiceitem()
                .setDate("2024-03-22")
                .setId(3)
                .setProducts(items1);

        final Invoiceitem invoiceitem4 = new Invoiceitem()
                .setId(4)
                .setDate("2024-03-24")
                .setProducts(items3);

        InvoiceCustomer invoiceCustomer1 = new InvoiceCustomer()
                .setCustomer(customer1)
                .setInvoiceitem(invoiceitem1);

        InvoiceCustomer invoiceCustomer2 = new InvoiceCustomer()
                .setCustomer(customer2)
                .setInvoiceitem(invoiceitem2);

        InvoiceCustomer invoiceCustomer3 = new InvoiceCustomer()
                .setCustomer(customer3)
                .setInvoiceitem(invoiceitem3);

        InvoiceCustomer invoiceCustomer4 = new InvoiceCustomer()
                .setCustomer(customer4)
                .setInvoiceitem(invoiceitem4);

        return new ArrayList<>(Arrays.asList(invoiceCustomer1,invoiceCustomer2,invoiceCustomer3,invoiceCustomer4));
    }
}
