package cl.company.ecommerce.model;

public class Roles {
    
    private int id;
    private String value;

    public Roles(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public Roles setId(int id) {
        this.id = id;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Roles setValue(String value) {
        this.value = value;
        return this;
    }
}
