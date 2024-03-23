package cl.company.ecommerce.repository;

import cl.company.ecommerce.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EcommerceRepositoryImpl implements EcommerceRepository{


    @Override
    public List<Customer> dataSourceCustomer() {
        List<Customer> customerList = new ArrayList<>(List.of(
                new Customer("frojas","Francica", "Rojas", 28, "+56225830430", "Calle 123"),
                new Customer("jperez","Juan", "Perez", 35, "+56225831245", "Avenida 456"),
                new Customer("mgonzalez","María", "González", 42, "+56225837890", "Calle Principal"),
                new Customer("psanchez","Pedro", "Sánchez", 45, "+56225833210", "Avenida Central"),
                new Customer("lmartinez","Luis", "Martínez", 50, "+56225839780", "Calle Secundaria"),
                new Customer("nlopez","Ana", "López", 38, "+56225831056", "Avenida Norte"),
                new Customer("cgomez","Carlos", "Gómez", 33, "+56225835570", "Calle Sur"),
                new Customer("efernandez","Elena", "Fernández", 29, "+56225836682", "Avenida Este"),
                new Customer("jdiaz","Javier", "Díaz", 47, "+56225838894", "Calle Oeste"),
                new Customer("lruiz","Laura", "Ruiz", 31, "+56225839912", "Avenida Poniente")
        ));
        return customerList;
    }
}
