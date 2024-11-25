package patterns.builder;

public abstract class HouseBuilder {

    protected House house;

    public HouseBuilder createHouse() {
        house = new House();
        return this;
    }

    public House build() {
        return house;
    }

    public abstract HouseBuilder buildFoundation();

    public abstract HouseBuilder buildWalls();

    public abstract HouseBuilder buildRoof();


}
