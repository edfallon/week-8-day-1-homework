package models;

public class Order {

    private String product;
    private int quantity;
    private int id;

    public Order(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Order(){

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
