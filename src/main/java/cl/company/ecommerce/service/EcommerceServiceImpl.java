package cl.company.ecommerce.service;

import cl.company.ecommerce.model.Customer;
import cl.company.ecommerce.model.Invoice;
import cl.company.ecommerce.model.Invoiceitem;
import cl.company.ecommerce.repository.EcommerceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EcommerceServiceImpl implements EcommerceService {

    @Autowired
    private EcommerceRepository ecommerceRepository;

    @Override
    public Invoice generateBill(String id) {
        // Buscar Cliente
        Optional<Customer> customerOptional = ecommerceRepository
                .dataSourceCustomer()
                .stream()
                .filter(x -> x.getId().equalsIgnoreCase(id))
                .findFirst();

        // Verificar si el cliente existe y calcular el descuento
        BigDecimal descuento = calcularDescuento(customerOptional, LocalDate.now().getDayOfWeek());

        // Simular la generación de la factura para el usuario
        List<Invoiceitem> items = Arrays.asList(
                new Invoiceitem(1L, "Producto 1", new BigDecimal("10.000"), 1),
                new Invoiceitem(2L, "Producto 2", new BigDecimal("10.000"), 1)
        );

        BigDecimal total = items.stream()
                .map(item -> item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        // Aplicar descuento al total
        total = total.subtract(total.multiply(descuento));

        return new Invoice(1L, customerOptional, items, total, descuento);
    }

    public BigDecimal calcularDescuento(Optional<Customer> customerOptional, DayOfWeek dayOfWeek) {
        // Verificar si el cliente está registrado y si es un día específico de la semana
        if (customerOptional.isPresent() && dayOfWeek == DayOfWeek.SUNDAY) {
            // Aplicar un descuento del 10% para clientes registrados los lunes
            return new BigDecimal("0.10"); // 10% de descuento
        } else {
            return BigDecimal.ZERO; // Sin descuento
        }
    }
}
