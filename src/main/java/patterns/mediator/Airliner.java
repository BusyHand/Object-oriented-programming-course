package patterns.mediator;

public class Airliner extends Aircraft {
    public Airliner(AirTrafficMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Лайнер " + name + ": " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Лайнер " + name + " получил: " + message);
    }
}