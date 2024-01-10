import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ECommerceSystemTest {

    @Test
    void testOrderPlacement() {
        // Create real objects
        Product product1 = new Product(1, "Product 1", 10.0);
        Product product2 = new Product(2, "Product 2", 15.0);
        Cart cart = new Cart();

        // Call the eCommerce system functions
        ECommerceSystem eCommerceSystem = new ECommerceSystem();
        eCommerceSystem.addProductToCart(product1);
        eCommerceSystem.addProductToCart(product2);

        Order order = eCommerceSystem.placeOrder(cart);

        // Assert the order details
        assertEquals(2, order.getProducts().size());
        assertEquals("Product 1", order.getProducts().get(0).getName());
        assertEquals("Product 2", order.getProducts().get(1).getName());
        assertEquals(OrderStatus.PLACED, order.getStatus());
    }

    @Test
    void addProductToCartTest() {
        // Create an instance of ECommerceSystem
        ECommerceSystem eCommerceSystem = new ECommerceSystem();

        // Create a sample product
        Product laptop = new Product(1, "Laptop", 999.99);

        // Call the addProductToCart method
        eCommerceSystem.addProductToCart(laptop);

        // Get the products in the cart
        List<Product> productsInCart = eCommerceSystem.getShoppingCart().getProducts();

        // Check if the product was added to the cart
        assertEquals(1, productsInCart.size());
        assertEquals(laptop, productsInCart.get(0));
    }

    @Test
    void testOrderStatus() {
        // Create real objects
        Order order = new Order(Arrays.asList(new Product(1, "Product 1", 10.0)), "SHIPPED");

        // Call the eCommerce system function
        ECommerceSystem eCommerceSystem = new ECommerceSystem();
        OrderStatus status = OrderStatus.valueOf(eCommerceSystem.checkOrderStatus(order));

        // Assert the order status
        assertEquals(OrderStatus.SHIPPED, status);
    }
}

