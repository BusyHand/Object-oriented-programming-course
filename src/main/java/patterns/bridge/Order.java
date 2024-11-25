package patterns.bridge;

public abstract class Order {
    protected PaymentMethod paymentMethod;

    public Order(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    abstract public void processOrder(double amount);
}