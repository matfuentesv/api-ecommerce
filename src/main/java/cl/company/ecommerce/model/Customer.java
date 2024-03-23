package cl.company.ecommerce.model;

import java.util.List;

public class Customer {

    private String id;
    private String name;
    private String lastName;
    private int age;
    private String phone;
    private String address;
    private List<Roles>roles;

    public Customer(){}

    public Customer(String id, String name, String lastName, int age, String phone, String address) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public Customer setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Customer setAge(int age) {
        this.age = age;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public Customer setRoles(List<Roles> roles) {
        this.roles = roles;
        return this;
    }
}
