package patterns.bridge;

public class Cash implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата: " + amount + " наличными.");
    }
}
