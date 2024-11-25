package lab_3.subtask_3;

import lombok.Getter;

public class Fish {

    @Getter
    protected AnimalType animalType = AnimalType.FISH;
    protected boolean isPredator;

    public Fish(boolean isPredator) {
        this.isPredator = isPredator;
    }

    protected void hunting() {
        if (isPredator) {
            System.out.print("Охочусь на мелкую рыбу\n");
        } else {
            System.out.print("Я не охотник\n");
        }
    }

    public void breathe() {
        System.out.print("Дышу воздухом под водой\n");
    }

}
