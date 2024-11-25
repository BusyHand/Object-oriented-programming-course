package lab_3.subtask_2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Pet {
    private String name;

    public Dog(double weight, int age, Gender gender, String name) {
        super(weight, age, gender);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog:" +
                "\n\tweight: " + getWeight() + " кг " + weightDescription() +
                "\n\tage: " + getAge() + " лет " + ageDescription() +
                "\n\tgender: " + getGender().getName() +
                "\n\tname: " + getName() +
                "\n";
    }

    public String nameDescription() {
        if (getGender().equals(Gender.FEMALE)) {
            return "Собака женского пола";
        }
        return "Пес";
    }

    @Override
    public String displayPet() {
        return "Перед вами " + weightDescription() + " " + ageDescription() + " " + nameDescription() + " по имени " + getName();
    }
}
