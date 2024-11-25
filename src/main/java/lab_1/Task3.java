package lab_1;

/**
3. Рисуем треугольник 
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10. 
*/
public class Task3 {

    public static void main(String[] args) {
        printTriangleWithSides10By10();
    }

    private static void printTriangleWithSides10By10() {
        for(int i = 1 ; i < 11; i++){
            for (int j = 0 ; j < i; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
