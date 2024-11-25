package patterns.facade;

public class Client {
    public static void main(String[] args) {
        Menu pizzaMenu = getPizzaMenu();
        Menu drinksMenu = getDrinksMenu();

        PizzeriaFacade pizzeria = new PizzeriaFacade(pizzaMenu, drinksMenu);

        pizzeria.displayMainMenu();

        Order order = pizzeria.createOrder(
                new Drink("Кока-Кола", 100),
                new Pizza("Маргарита"),
                new Drink("Спрайт", 100),
                new Drink("Вода", 50));

        order.display();
    }

    public static Menu getPizzaMenu() {
        Menu pizzaMenu = new Menu("Меню Пицц");
        Pizza margherita = new Pizza("Маргарита");
        margherita.addIngredient(new Ingredient("Сыр", 150));
        margherita.addIngredient(new Ingredient("Помидоры", 100));
        pizzaMenu.addPosition(margherita);

        Pizza pepperoniPizza = new Pizza("Пепперони");
        pepperoniPizza.addIngredient(new Ingredient("Сыр", 150));
        pepperoniPizza.addIngredient(new Ingredient("Пепперони", 200));
        pizzaMenu.addPosition(pepperoniPizza);
        return pizzaMenu;
    }

    public static Menu getDrinksMenu() {
        Menu drinksMenu = new Menu("Меню Напитков");
        drinksMenu.addPosition(new Drink("Кока-Кола", 100));
        drinksMenu.addPosition(new Drink("Спрайт", 100));
        drinksMenu.addPosition(new Drink("Вода", 50));
        return drinksMenu;
    }

}
