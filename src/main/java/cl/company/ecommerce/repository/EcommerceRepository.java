package cl.company.ecommerce.repository;

import cl.company.ecommerce.model.Customer;

import java.util.List;

public interface EcommerceRepository {

    List<Customer> dataSourceCustomer();
}
