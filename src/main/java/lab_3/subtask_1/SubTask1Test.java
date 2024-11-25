package lab_3.subtask_1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SubTask1Test {

    private Pegasus pegasus = new Pegasus("Pegasus");


    @Test
    public void testConstructor() {
        assertEquals("Pegasus", pegasus.getName());
    }

    @Test
    public void testFly() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        pegasus.fly();

        String expectedOutput = "Пегас Pegasus летит";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testInheritance() {
        assertNotNull(pegasus);
        assertEquals(Horse.class, pegasus.getClass().getSuperclass(), "Horse class should be super class of Pegas");
    }
}
