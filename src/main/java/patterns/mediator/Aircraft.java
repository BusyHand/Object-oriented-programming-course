package patterns.mediator;

public abstract class Aircraft {
    protected AirTrafficMediator mediator;
    protected String name;

    public Aircraft(AirTrafficMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.registerAircraft(this);
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
