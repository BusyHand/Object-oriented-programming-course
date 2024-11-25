package patterns.state;

public class WeatherState implements BotState {
    @Override
    public BotState handleMessage(String message) {
        System.out.println("Клиент: " + message);
        System.out.println("Бот: Сегодня солнечно и не ветрено.");
        System.out.println("Бот:  Что-то хочешь спросить или узнать?");
        return new GoodByeState();
    }
}
