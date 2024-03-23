package cl.company.ecommerce.model;

import java.util.List;

public class Invoiceitem {
    
    private int id;
    private String date;
    private List<Product> products;


    public int getId() {
        return id;
    }

    public Invoiceitem setId(int id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Invoiceitem setDate(String date) {
        this.date = date;
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Invoiceitem setProducts(List<Product> products) {
        this.products = products;
        return this;
    }
}
