package lab_3.subtask_3;

public class Ape extends Animal {

    public Ape(AnimalType animalType) {
        super(animalType, true);
    }

    @Override
    public void hunting() {
        super.hunting();
        System.out.print("Но и с помощью палки на мелководье\n");
    }

    public void eatBanana() {
        System.out.print("Ем много бананов\n");
    }
}
