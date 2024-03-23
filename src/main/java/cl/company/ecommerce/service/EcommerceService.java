package cl.company.ecommerce.service;

import cl.company.ecommerce.model.Invoice;

public interface EcommerceService {

    Invoice generateBill( String usuarioId);
}
