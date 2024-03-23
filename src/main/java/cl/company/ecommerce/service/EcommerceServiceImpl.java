package cl.company.ecommerce.service;

import cl.company.ecommerce.model.Customer;
import cl.company.ecommerce.model.Invoice;
import cl.company.ecommerce.model.InvoiceCustomer;
import cl.company.ecommerce.repository.EcommerceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;

@Service
public class EcommerceServiceImpl implements EcommerceService {

    @Autowired
    private EcommerceRepository ecommerceRepository;

    @Override
    public Invoice generateBill(String id) {

        final InvoiceCustomer invoiceCustomer = ecommerceRepository
                .dataSourceInvoceCustomer()
                .stream()
                .filter(x -> x.getCustomer().getId().equalsIgnoreCase(id))
                .findFirst().orElse(null);


        if (invoiceCustomer == null) {
            return new Invoice();
        }

        // Verificar si el cliente existe y calcular el descuento
        BigDecimal descuento = calculateDiscount(invoiceCustomer.getCustomer(), LocalDate.now().getDayOfWeek());


        BigDecimal total = invoiceCustomer.getInvoiceitems()
                                          .stream()
                                          .map(item -> item.getUnitPrice().multiply(BigDecimal.valueOf(item.getQuantity())))
                                          .reduce(BigDecimal.ZERO, BigDecimal::add);

        // Aplicar descuento al total
        BigDecimal totalConDescuento = total.subtract(total.multiply(descuento));

        // Crear la factura con los datos calculados
        return new Invoice(invoiceCustomer.getCustomer(), invoiceCustomer.getInvoiceitems(), total, descuento, totalConDescuento,invoiceCustomer.getDate());
    }

    public BigDecimal calculateDiscount(Customer customer, DayOfWeek dayOfWeek) {
        // Verificar si el cliente está registrado
        if (customer != null) {
            // Aplicar un descuento según el día de la semana
            return switch (dayOfWeek) {
                case MONDAY -> new BigDecimal("0.10"); // 10% de descuento los lunes
                case TUESDAY -> new BigDecimal("0.05"); // 5% de descuento los martes
                case WEDNESDAY -> new BigDecimal("0.04"); // 4% de descuento los miércoles
                case THURSDAY -> new BigDecimal("0.03"); // 3% de descuento los jueves
                case FRIDAY -> new BigDecimal("0.02"); // 2% de descuento los jueves
                default -> BigDecimal.ZERO; // Sin descuento por defecto para otros días
            };
        } else {
            return BigDecimal.ZERO; // Sin descuento si el cliente no está registrado
        }
    }
}
