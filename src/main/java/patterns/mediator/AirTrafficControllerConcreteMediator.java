package patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControllerConcreteMediator implements AirTrafficMediator {

    private List<Aircraft> aircrafts;

    public AirTrafficControllerConcreteMediator() {
        this.aircrafts = new ArrayList<>();
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    @Override
    public void sendMessage(String message, Aircraft sender) {
        for (Aircraft aircraft : aircrafts) {
            if (aircraft != sender) {
                aircraft.receiveMessage(message);
            }
        }
    }
}
