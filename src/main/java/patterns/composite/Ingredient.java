package patterns.composite;

public class Ingredient implements MenuComponent {
    private String name;
    private double price;

    public Ingredient(String name, double price) {
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
        System.out.println("Ингредиент: " + getName() + ", Цена: " + getPrice() + " руб.");
    }
}
