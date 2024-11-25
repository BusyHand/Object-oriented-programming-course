package lab_1;

/**
2. Рисуем прямоугольник Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
*/
public class Task2 {

    public static void main(String[] args) {
        printRectangleMN(2,4);
    }

    private static void printRectangleMN(int m, int n) {
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }

}
