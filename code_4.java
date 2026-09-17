/*
Q4. Online Shopping Cart (Aggregation)
Problem
In e-commerce, an order contains multiple products. Instead of storing everything in one class, we model Order and Product. This represents aggregation because Order contains Products but both exist independently.
*/

import java.util.ArrayList;
import java.util.List;

class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return productName + " x" + quantity + " = " + (price * quantity);
    }
}

class Order {
    private String orderId;
    private List<Product> products = new ArrayList<>();

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Products:\n");
        for (Product p : products) {
            sb.append(p).append("\n");
        }
        sb.append("Total: ").append(calculateTotal());
        return sb.toString();
    }
}

public class code_4 {
    public static void main(String[] args) {
        Order order = new Order("ORD101");
        order.addProduct(new Product("Laptop", 50000, 1));
        order.addProduct(new Product("Mouse", 500, 2));
        order.addProduct(new Product("Keyboard", 1500, 1));
        System.out.println(order);
    }
}
