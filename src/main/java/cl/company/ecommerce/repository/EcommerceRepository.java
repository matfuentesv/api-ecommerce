package cl.company.ecommerce.repository;

import cl.company.ecommerce.model.InvoiceCustomer;
import java.util.List;

public interface EcommerceRepository {

    List<InvoiceCustomer> dataSourceInvoceCustomer();
}
