package patterns.mediator;

public class Airplane extends Aircraft {
    public Airplane(AirTrafficMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Самолет " + name + ": " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Самолет " + name + " получил: " + message);
    }
}
