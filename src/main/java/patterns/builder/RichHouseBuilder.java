package patterns.builder;

import patterns.builder.enums.Foundation;
import patterns.builder.enums.Roof;
import patterns.builder.enums.Walls;

public class RichHouseBuilder extends HouseBuilder {
    @Override
    public HouseBuilder buildFoundation() {
        house.setFoundation(Foundation.БЕТОН);
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        house.setWalls(Walls.КИРПИЧ);
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof(Roof.ШИФЕР);
        return this;
    }
}
