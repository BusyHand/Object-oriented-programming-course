package lab_2;


public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(2, 0, 0);
        Circle circle2 = new Circle(3, -3, 4);
        System.out.println(circle1.findIntersectionPoint(circle2));
    }
}
