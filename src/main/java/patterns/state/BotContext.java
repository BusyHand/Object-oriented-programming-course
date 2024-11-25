package patterns.state;

public class BotContext {

    private BotState botState;

    public BotContext() {
        botState = new GreetingState();
    }

    public void handleMessage(String message) {
        botState = botState.handleMessage(message);
    }
}
