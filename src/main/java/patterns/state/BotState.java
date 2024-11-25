package patterns.state;

public interface BotState {

    BotState handleMessage(String message);

}
