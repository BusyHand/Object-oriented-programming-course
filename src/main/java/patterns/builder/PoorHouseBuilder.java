package patterns.builder;

import patterns.builder.enums.Foundation;
import patterns.builder.enums.Roof;
import patterns.builder.enums.Walls;

public class PoorHouseBuilder extends HouseBuilder {
    @Override
    public HouseBuilder buildFoundation() {
        house.setFoundation(Foundation.ЖВАЧКА_С_ОПИЛКАМИ);
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        house.setWalls(Walls.КАРТОН);
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof(Roof.ПОЛИЭТИЛЕН);
        return this;
    }
}