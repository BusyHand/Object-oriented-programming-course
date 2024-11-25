package patterns.composite;

// todo переделать
public class Client {

    public static void main(String[] args) {
        Menu mainMenu = getMainMenu();
        mainMenu.display();
    }

    public static Menu getMainMenu() {
        MenuComponent cheese = new Ingredient("Сыр", 150);
        MenuComponent tomato = new Ingredient("Помидоры", 100);
        MenuComponent pepperoni = new Ingredient("Пепперони", 200);
        MenuComponent olives = new Ingredient("Оливы", 120);

        Pizza margherita = new Pizza("Маргарита");
        margherita.addIngredient(cheese);
        margherita.addIngredient(tomato);

        Pizza pepperoniPizza = new Pizza("Пепперони");
        pepperoniPizza.addIngredient(cheese);
        pepperoniPizza.addIngredient(tomato);
        pepperoniPizza.addIngredient(pepperoni);
        pepperoniPizza.addIngredient(olives);

        MenuComponent cola = new Drink("Кока-Кола", 100);
        MenuComponent sprite = new Drink("Спрайт", 100);
        MenuComponent water = new Drink("Вода", 50);

        Menu pizzaMenu = new Menu("Меню Пицц");
        pizzaMenu.addPosition(margherita);
        pizzaMenu.addPosition(pepperoniPizza);

        Menu drinksMenu = new Menu("Меню Напитков");
        drinksMenu.addPosition(cola);
        drinksMenu.addPosition(sprite);
        drinksMenu.addPosition(water);

        Menu mainMenu = new Menu("Меню пиццерии");
        mainMenu.addPosition(pizzaMenu);
        mainMenu.addPosition(drinksMenu);
        return mainMenu;
    }
}
