package patterns.bridge;

public class PickupOrder extends Order {
    public PickupOrder(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void processOrder(double amount) {
        System.out.println("Самовывоз заказа...");
        paymentMethod.pay(amount);
    }
}
