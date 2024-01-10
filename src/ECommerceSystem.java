import java.util.List;

public class ECommerceSystem {
    private Cart shoppingCart;

    // Constructor
    public ECommerceSystem() {
        this.shoppingCart = new Cart();
    }

    public Cart getShoppingCart() {
        return shoppingCart;
    }

    public Order placeOrder(Cart cart) {
        // Perform logic to create and place an order
        List<Product> productsInCart = cart.getProducts();
        Order order = new Order(productsInCart, "Placed");
        // You may perform additional logic, such as updating inventory or processing payments
        return order;
    }

    // Add other methods related to the eCommerce system

    public String checkOrderStatus(Order order) {
        return order.getStatus();
    }

    public void addProductToCart(Product product) {
        shoppingCart.getProducts().add(product);
    }

    public static void main(String[] args) {
        // Example usage:
        Product laptop = new Product(1, "Laptop", 999.99);
        Cart shoppingCart = new Cart();

        // Add the laptop to the shopping cart
        shoppingCart.addProduct(laptop);

        // Print the products in the cart
        System.out.println("Products in the cart: " + shoppingCart.getProducts());

        // Sample usage of the ECommerceSystem
        Product product1 = new Product(2, "Smartphone", 499.99);

        Cart cart = new Cart();
        cart.addProduct(product1);

        ECommerceSystem eCommerceSystem = new ECommerceSystem();
        Order order = eCommerceSystem.placeOrder(cart);
        System.out.println("Order Status: " + order.getStatus());
    }
}
