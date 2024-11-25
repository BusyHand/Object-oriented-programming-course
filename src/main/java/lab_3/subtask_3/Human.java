package lab_3.subtask_3;

import lombok.Getter;
import lombok.Setter;

public class Human extends Ape {

    @Getter
    @Setter
    private String name;

    public Human() {
        super(AnimalType.MAMMALS);
    }

    @Override
    public void hunting() {
        super.hunting();
        System.out.print("Но лучше всё-таки удочкой\n");
    }

    public void goWork() {
        System.out.print("Я " + getName() + " иду на завод ;(\n" );
    }
}
