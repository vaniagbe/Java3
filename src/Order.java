import java.util.List;

class Order {
    private static int nextOrderId = 1;

    private int orderId;
    private List<Product> products;
    private String status;


    public Order(List<Product> products, String placed) {
        this.orderId = nextOrderId++;
        this.products = products;
        this.status = "Pending"; // Initial status is set to "Pending"
    }

    // Getters and setters

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

