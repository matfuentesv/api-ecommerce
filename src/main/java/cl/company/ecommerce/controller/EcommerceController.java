package cl.company.ecommerce.controller;

import cl.company.ecommerce.exeption.UsuarioNotFoundException;
import cl.company.ecommerce.model.Invoice;
import cl.company.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;

    @GetMapping("/{usuarioId}/factura")
    public ResponseEntity<Invoice> generarFactura(@PathVariable String usuarioId) {
        try {
            Invoice factura = ecommerceService.generateBill(usuarioId);
            return ResponseEntity.ok(factura);
        } catch (UsuarioNotFoundException e) {
            Map<String, String> responseBody = new HashMap<>();
            responseBody.put("mensaje", e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body((Invoice) responseBody);
        }
    }


}
