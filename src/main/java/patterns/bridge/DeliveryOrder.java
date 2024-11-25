package patterns.bridge;

public class DeliveryOrder extends Order {
    public DeliveryOrder(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void processOrder(double amount) {
        System.out.println("Доставка заказа...");
        paymentMethod.pay(amount);
    }
}