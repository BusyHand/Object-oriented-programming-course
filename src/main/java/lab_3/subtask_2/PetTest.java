package lab_3.subtask_2;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {




    @Test
    public void test() {
        Cat cat1 = new Cat(5, 3, Gender.FEMALE, "Маркиза");
        Cat cat2 = new Cat(5, 8, Gender.MALE, "Маркиз");
        Dog dog1 = new Dog(10, 12, Gender.FEMALE, "Мухтарина");
        Dog dog2 = new Dog(10, 5, Gender.MALE, "Мухтар");

        System.out.print(cat1);
        System.out.print(cat2);
        System.out.print(dog1);
        System.out.print(dog2);

        System.out.println(cat1.displayPet());
        System.out.println(cat2.displayPet());
        System.out.println(dog1.displayPet());
        System.out.println(dog2.displayPet());
    }

    @Test
    public void tes3() {
        Cat cat1 = new Cat(1000, 3, Gender.FEMALE, "Маркиза");
    }

    @Test
    public void tes4() {
        Cat cat2 = new Cat(-1000, 8, Gender.MALE, "Маркиз");
    }

    @Test
    public void tes5() {
        Dog dog1 = new Dog(10, 40, Gender.FEMALE, "Мухтарина");
    }

    @Test
    public void tes6() {
        Dog dog2 = new Dog(10, -122, Gender.MALE, "Мухтар");
    }

}
