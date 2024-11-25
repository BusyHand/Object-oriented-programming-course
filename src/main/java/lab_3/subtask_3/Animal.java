package lab_3.subtask_3;

public class Animal extends Fish {

    public Animal(AnimalType animalType, boolean isPredator) {
        super(isPredator);
        if (AnimalType.FISH.equals(animalType)) {
            throw new RuntimeException("Animal can not be fish");
        }
        super.animalType = animalType;
    }

    @Override
    public void breathe() {
        System.out.print("Дышу воздухом на суше\n");
    }

    @Override
    public void hunting() {
        super.hunting();
        if (isPredator) {
            System.out.print("Не только под водой\n");
        } else {
            System.out.print("Я Травоядный\n");
        }
    }
}
