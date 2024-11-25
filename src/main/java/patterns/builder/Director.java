package patterns.builder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Director {

    private final HouseBuilder houseBuilder;

    public House buildHouse() {
        return houseBuilder.createHouse()
                .buildFoundation()
                .buildWalls()
                .buildRoof()
                .build();
    }

}
