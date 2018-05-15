package models;

import javax.persistence.*;

@Entity
@Table(name = "orders")

public class Order {

    private String product;
    private int quantity;
    private int id;
    private Customer customer;

    public Order(String product, int quantity, Customer customer) {
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
    }

    public Order(){

    }

    @Column(name = "products")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Column(name = "quantities")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
