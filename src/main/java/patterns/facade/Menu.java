package patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addPosition(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void display() {
        System.out.println("Меню: " + getName());
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.display();
        }
    }
}
