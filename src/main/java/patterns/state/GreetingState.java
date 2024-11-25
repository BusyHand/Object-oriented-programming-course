package patterns.state;

public class GreetingState implements BotState {
    @Override
    public BotState handleMessage(String message) {
        System.out.println("Клиент: " + message);
        System.out.println("Бот: Привет! Как тебя зовут?");
        return new NameState();
    }
}
