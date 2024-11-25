package patterns.adapter;

public class Client {
    public static void main(String[] args) {
        GasolineFueling gasolineFueling = new GasolineСar();
        gasolineFueling.refuel();

        GasolineFueling electricFueling = new ElectricCarAdapter(new ElectricCar());
        electricFueling.refuel();
    }
}
