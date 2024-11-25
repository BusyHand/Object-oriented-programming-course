package patterns.bridge;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата: " + amount + " картой.");
    }
}
