package patterns.bridge;

public class Client {
    public static void main(String[] args) {
        Order deliveryOrder = new DeliveryOrder(new CreditCard());
        deliveryOrder.processOrder(29.99);
        System.out.println();

        deliveryOrder = new DeliveryOrder(new Cash());
        deliveryOrder.processOrder(29.99);
        System.out.println();

        Order pickupOrder = new PickupOrder(new CreditCard());
        pickupOrder.processOrder(15.50);
        System.out.println();

        pickupOrder = new PickupOrder(new Cash());
        pickupOrder.processOrder(15.50);

    }
}
