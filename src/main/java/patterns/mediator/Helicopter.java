package patterns.mediator;
public class Helicopter extends Aircraft {
    public Helicopter(AirTrafficMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Вертолет " + name + ": " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Вертолет " + name + " получил: " + message);
    }
}