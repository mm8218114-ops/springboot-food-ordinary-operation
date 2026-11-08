package jsp.sprinigfood.entity;

public enum OrderStatus {
    PENDING,          // Order created, waiting for restaurant confirmation
    CONFIRMED,        // Restaurant accepted the order
    PREPARING,        // Food is being prepared
    READY_FOR_PICKUP, // Food is ready for delivery partner
    OUT_FOR_DELIVERY, // Delivery partner picked up the order
    DELIVERED,        // Order successfully delivered
    CANCELLED         // Order cancelled by customer or restaurant
}
