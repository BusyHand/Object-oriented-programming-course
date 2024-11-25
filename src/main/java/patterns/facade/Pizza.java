package patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements MenuComponent {
    private String name;
    private List<MenuComponent> ingredients = new ArrayList<>();

    public Pizza(String name) {
        this.name = name;
    }

    public void addIngredient(MenuComponent ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(MenuComponent ingredient) {
        ingredients.remove(ingredient);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (MenuComponent ingredient : ingredients) {
            totalPrice += ingredient.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void display() {
        System.out.println("Пицца: " + getName() + ", Общая цена: " + getPrice() + " руб.");
        System.out.println("Ингредиенты:");
        for (MenuComponent ingredient : ingredients) {
            ingredient.display();
        }
    }
}
