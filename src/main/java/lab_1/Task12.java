package lab_1;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 12.	Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести массив на экран.
 * Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class Task12 {

    public static void main(String[] args) {
        int[][] array = initDoubleArrayOfRandomValues(8, 5);
        printArray(array);
    }

    private static int[][] initDoubleArrayOfRandomValues(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(-5, 6);
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
