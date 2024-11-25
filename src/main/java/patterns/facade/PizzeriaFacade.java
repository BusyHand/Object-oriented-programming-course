package patterns.facade;

public class PizzeriaFacade {
    private final Menu pizzaMenu;
    private final Menu drinksMenu;

    public PizzeriaFacade(Menu pizzaMenu, Menu drinksMenu) {
        this.pizzaMenu = pizzaMenu;
        this.drinksMenu = drinksMenu;
    }

    /**
     * Operation 1
     */
    public void displayMainMenu() {
        pizzaMenu.display();
        drinksMenu.display();
    }

    /**
     * Operation 2
     */
    public Order createOrder(MenuComponent... menuComponents) {
        Order order = new Order();
        for (MenuComponent menuComponent : menuComponents) {
            order.addPosition(menuComponent);
        }
        return order;
    }

}
