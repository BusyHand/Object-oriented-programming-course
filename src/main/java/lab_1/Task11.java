package lab_1;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 11.	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 * Вывести массив на экран.
 */
public class Task11 {

    public static void main(String[] args) {
        int[][] array = initDoubleArrayOfRandomValues(8, 5);
        printArray(array);
    }

    private static int[][] initDoubleArrayOfRandomValues(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(10, 100);
            }
        }
        return array;
    }

    private static void printArray(int[][] array) {
        for (int[] innerArray : array) {
            for (int value : innerArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
