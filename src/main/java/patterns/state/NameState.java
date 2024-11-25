package patterns.state;

public class NameState implements BotState {
    @Override
    public BotState handleMessage(String message) {
        System.out.println("Клиент: " + message);
        System.out.println("Бот: Приятно познакомиться " + message);
        System.out.println("Бот: Какой у тебя любимый цвет?");
        return new ColorState();
    }
}
