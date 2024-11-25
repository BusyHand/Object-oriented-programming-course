package patterns.mediator;

public interface AirTrafficMediator {

    void registerAircraft(Aircraft aircraft);

    void sendMessage(String message, Aircraft sender);
}
