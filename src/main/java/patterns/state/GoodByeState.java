package patterns.state;

public class GoodByeState implements BotState {
    @Override
    public BotState handleMessage(String message) {
        System.out.println("Клиент: " + message);
        System.out.println("Бот: Спасибо за общение, до завтра!");
        return new GreetingState();
    }
}
