package patterns.state;

public class Client {
    public static void main(String[] args) {
        BotContext botContext = new BotContext();
        botContext.handleMessage("Привет");
        botContext.handleMessage("Кирилл");
        botContext.handleMessage("Мой любимый цвет черный");
        botContext.handleMessage("Какая сегодня погода?");
        botContext.handleMessage("Нет, спасибо, до завтра");
    }
}
