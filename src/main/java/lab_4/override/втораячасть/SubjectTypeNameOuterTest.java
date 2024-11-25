package lab_4.override.втораячасть;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class SubjectTypeNameOuterTest {

    private final SubjectTypeNameOuter subjectTypeNameOuter = new SubjectTypeNameOuter();

    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCat() {
        Cat cat = new Cat();

        subjectTypeNameOuter.outputSubjectTypeName(cat);

        assertThat(outputStream.toString())
                .isEqualTo("Кошка");
    }

    @Test
    public void testBird() {
        Bird cat = new Bird();

        subjectTypeNameOuter.outputSubjectTypeName(cat);

        assertThat(outputStream.toString())
                .isEqualTo("Птица");
    }

    @Test
    public void testDog() {
        Dog cat = new Dog();

        subjectTypeNameOuter.outputSubjectTypeName(cat);

        assertThat(outputStream.toString())
                .isEqualTo("Собака");
    }

    @Test
    public void testLamp() {
        Lamp cat = new Lamp();

        subjectTypeNameOuter.outputSubjectTypeName(cat);

        assertThat(outputStream.toString())
                .isEqualTo("Лампа");
    }
}
