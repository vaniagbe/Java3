import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    // Empty constructor
    public Cart() {
        this.products = new ArrayList<>();
    }

    // Constructor with parameters if needed
    public Cart(List<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public Order placeOrder() {
        // Create a new Order instance
        Order order = new Order(this.products, "Placed");

        // Clear the products in the cart after placing the order
        this.products.clear();

        return order;
    }

    // Getter for products
    public List<Product> getProducts() {
        return products;
    }

    // Other methods of the Cart class...
}
