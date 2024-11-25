package patterns.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ElectricCarAdapter implements GasolineFueling {
    private final ElectricCar electricCar;

    @Override
    public void refuel() {
        electricCar.charge();
    }
}
