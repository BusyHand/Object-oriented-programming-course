package lab_2;

import lombok.Data;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.*;

@Data
public class Circle {

    private double radius;
    private Point point;

    @Data
    public static class Point {
        private int centerPositionX;
        private int centerPositionY;

        private Point(int centerPositionX, int centerPositionY) {
            this.centerPositionX = centerPositionX;
            this.centerPositionY = centerPositionY;
        }

        private int getRandom() {
            return ThreadLocalRandom.current().nextInt(-99, 100);
        }

        /**
         * 2.	Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости с диагональю от [-99;-99] до [99;99].
         * Обратите внимание на то, что требуется создать обычный метод, применимый к уже существующему объекту, а не конструктор создающий новый объект.
         */
        private void changeRandomCenterPosition() {
            centerPositionX = getRandom();
            centerPositionY = getRandom();
        }

        public double getLengthBetweenCenters(Point otherPoint) {
            int x2 = otherPoint.getCenterPositionX();
            int y2 = otherPoint.getCenterPositionY();
            return sqrt(pow(x2 - centerPositionX, 2) + pow(y2 - centerPositionY, 2));
        }
    }

    /**
     * 3.	Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью,
     * координаты центра и радиус окружности пользователь вводил с клавиатуры.
     */
    public Circle() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        this.radius = scanner.nextDouble();
        this.point = new Point(scanner.nextInt(), scanner.nextInt());
    }

    public Circle(double radius, int centerPositionX, int centerPositionY) {
        this.radius = radius;
        this.point = new Point(centerPositionX, centerPositionY);
    }

    /**
     * 1.   Создайте в классе Circle метод, вычисляющий длину окружности.
     */
    public double getLength() {
        return 2 * PI * radius;
    }

    public void changeRandomCenterPosition() {
        point.changeRandomCenterPosition();
    }

    /**
     * 4. 	Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.
     */
    public double getLengthBetweenCenters(Circle otherCircle) {
        return point.getLengthBetweenCenters(otherCircle.getPoint());
    }

    /**
     * 5.	Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке. Учтите, что возможен вариант,
     * когда одна окружность содержится внутри другой и при этом всё равно возможно касание в одной точке.
     */
    public boolean isTouchOtherInOnePoint(Circle otherCircle) {
        double distanceBetweenCenters = getLengthBetweenCenters(otherCircle);
        return !equals(otherCircle) &&
                (distanceBetweenCenters == radius + otherCircle.radius ||
                        distanceBetweenCenters == abs(radius - otherCircle.radius));
    }

    /**
     * 6.   Special for me
     * Найти координаты точки пересечения двух окружностей
     */
    public String findIntersectionPoint(Circle otherCircle) {
        double x1 = this.point.centerPositionX;
        double y1 = this.point.centerPositionY;
        double r1 = this.radius;

        double x2 = otherCircle.point.centerPositionX;
        double y2 = otherCircle.point.centerPositionY;
        double r2 = otherCircle.radius;

        double d = getLengthBetweenCenters(otherCircle);

        if (!isTouchOtherInOnePoint(otherCircle)) {
            return "Окружности не косаются в одной точке";
        }

        double a = (r1 * r1 - r2 * r2 + d * d) / (2 * d);
        double h = sqrt(r1 * r1 - a * a);

        double x0 = x1 + a * (x2 - x1) / d;
        double y0 = y1 + a * (y2 - y1) / d;

        double xIntersection = x0 + h * (y2 - y1) / d;
        double yIntersection = y0 - h * (x2 - x1) / d;

        return xIntersection + " " + yIntersection;
    }

}
