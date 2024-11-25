package patterns.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private final List<MenuComponent> items;

    public Order() {
        items = new ArrayList<>();
    }

    public Order addPosition(MenuComponent... itemsToAdd) {
        items.addAll(Arrays.asList(itemsToAdd));
        for (MenuComponent item : itemsToAdd) {
            System.out.println("Добавлено в заказ: " + item.getName());
        }
        return this;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (MenuComponent item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void display() {
        System.out.println("Содержимое заказа:");
        for (MenuComponent item : items) {
            item.display();
        }
        System.out.println("Общая сумма заказа: " + getTotalPrice() + " руб.");
    }
}
