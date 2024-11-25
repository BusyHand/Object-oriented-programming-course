package lab_2;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    /**
     * 1.   Создайте в классе Circle метод, вычисляющий длину окружности.
     */
    @Test
    public void testGetLength() {
        Circle circle = new Circle(5.0, 0, 0);

        double length = circle.getLength();

        double expectedLength = 2 * Math.PI * 5.0;
        assertEquals(expectedLength, length, 0.0001);
    }

    /**
     * 2.	Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости с диагональю от [-99;-99] до [99;99].
     * Обратите внимание на то, что требуется создать обычный метод, применимый к уже существующему объекту, а не конструктор создающий новый объект.
     */
    @Test
    public void testChangeRandomCenterPosition() {
        Circle circle = new Circle(5.0, 0, 0);

        // Save the initial position before changing
        int initialX = circle.getPoint().getCenterPositionX();
        int initialY = circle.getPoint().getCenterPositionY();

        // Change the center position
        circle.changeRandomCenterPosition();

        // Retrieve the new position
        int newX = circle.getPoint().getCenterPositionX();
        int newY = circle.getPoint().getCenterPositionY();

        // Check that the new position is within the bounds [-99, 99]
        assertTrue(newX >= -99 && newX <= 99, "X coordinate is out of bounds");
        assertTrue(newY >= -99 && newY <= 99, "Y coordinate is out of bounds");

        // Optionally, check that the position has changed (not strictly necessary)
        assertTrue(newX != initialX || newY != initialY, "Center position did not change");
    }

    /**
     * 3.	Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью,
     * координаты центра и радиус окружности пользователь вводил с клавиатуры.
     */

    @Test
    public void testDefaultConstructor() {
        String simulatedInput = "10\n1\n2\n"; // radius = 10, centerX = 1, centerY = 2
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        Circle circle = new Circle();

        assertEquals(10.0, circle.getRadius(), 0.0001);
        assertEquals(1, circle.getPoint().getCenterPositionX());
        assertEquals(2, circle.getPoint().getCenterPositionY());
    }


    /**
     * 4. 	Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.
     */
    @Test
    public void testGetLengthBetweenCenters() {
        Circle circle1 = new Circle(5.0, 1, 2);
        Circle circle2 = new Circle(3.0, 4, 6);

        int x1 = circle1.getPoint().getCenterPositionX();
        int y1 = circle1.getPoint().getCenterPositionY();
        int x2 = circle2.getPoint().getCenterPositionX();
        int y2 = circle2.getPoint().getCenterPositionY();
        double expectedDistance = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

        double actualDistance = circle1.getLengthBetweenCenters(circle2);

        assertEquals(expectedDistance, actualDistance, 0.0001);
    }
}

