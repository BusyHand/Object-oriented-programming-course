package patterns.state;

public class ColorState implements BotState {
    @Override
    public BotState handleMessage(String message) {
        System.out.println("Клиент: " + message);
        System.out.println("Бот: Классный цвет!");
        System.out.println("Бот: Что-то хочешь спросить или узнать?");
        return new WeatherState();
    }
}
