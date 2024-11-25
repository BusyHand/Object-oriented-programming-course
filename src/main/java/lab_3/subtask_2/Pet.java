package lab_3.subtask_2;

import lombok.Getter;

@Getter
public abstract class Pet {

    private double weight;

    private int age;

    private Gender gender;

    public Pet(double weight, int age, Gender gender) {
        if (weight < 0.5 || weight > 20) {
            throw new IllegalArgumentException("Домашние животное мертво, замените вес");
        }
        if (age < 0 || age > 20) {
            throw new IllegalArgumentException("Домашние животное мертво, замените возраст");
        }
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public abstract String displayPet();

    public String weightDescription() {
        String result = "";
        if (getWeight() >= 8) {
            if (gender.equals(Gender.FEMALE)) {
                result += "Толстая";
            } else {
                result += "Толстый";
            }
        } else {
            if (gender.equals(Gender.FEMALE)) {
                result += "Худая";
            } else {
                result += "Худой";
            }
        }
        return result;
    }

    public String ageDescription() {
        String result = "";
        if (getAge() >= 8) {
            if (gender.equals(Gender.FEMALE)) {
                result += "Старая";
            } else {
                result += "Старый";
            }
        } else {
            if (gender.equals(Gender.FEMALE)) {
                result += "Молодая";
            } else {
                result += "Молодой";
            }
        }
        return result;
    }
}
