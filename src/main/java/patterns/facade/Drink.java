package patterns.facade;

public class Drink implements MenuComponent {
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("Напиток: " + getName() + ", Цена: " + getPrice() + " руб.");
    }
}