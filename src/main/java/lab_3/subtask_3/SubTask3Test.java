package lab_3.subtask_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTask3Test {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        originalOut = System.out; // Store the original System.out
        System.setOut(new PrintStream(outputStream)); // Redirect System.out
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut); // Reset System.out to original
    }

    @Test
    public void testAnimalHuntingAsPredator() {
        Animal animal = new Animal(AnimalType.MAMMALS, true);
        animal.hunting();
        String expected = """
                Охочусь на мелкую рыбу
                Не только под водой
                """;
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testAnimalHuntingAsHerbivore() {
        Animal animal = new Animal(AnimalType.MAMMALS, false);
        animal.hunting();
        String expected = """
                Я не охотник
                Я Травоядный
                """;
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testFishHuntingAsPredator() {
        Fish fish = new Fish(true);
        fish.hunting();
        String expected = "Охочусь на мелкую рыбу\n";
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testFishHuntingAsHerbivore() {
        Fish fish = new Fish(false);
        fish.hunting();
        String expected = "Я не охотник\n";
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testApeHunting() {
        Ape ape = new Ape(AnimalType.MAMMALS);
        ape.hunting();
        String expected = """
                Охочусь на мелкую рыбу
                Не только под водой
                Но и с помощью палки на мелководье
                """;
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testApeEatingBanana() {
        Ape ape = new Ape(AnimalType.MAMMALS);
        ape.eatBanana();
        String expected = "Ем много бананов\n";
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testHumanHunting() {
        Human human = new Human();
        human.hunting();
        String expected = """
                Охочусь на мелкую рыбу
                Не только под водой
                Но и с помощью палки на мелководье
                Но лучше всё-таки удочкой
                """;
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testHumanGoWork() {
        Human human = new Human();
        human.setName("Антон");
        human.goWork();
        String expected = "Я Антон иду на завод ;(\n";
        assertEquals(expected, outputStream.toString());
    }

}
