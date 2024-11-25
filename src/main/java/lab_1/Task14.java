package lab_1;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 14.	Создать метод, который будет выводить указанный массив на экран в строку.
 * С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов из 10 элементов
 * каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.
 */
public class Task14 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Array : " + (i + 1));
            int[] array = initArrayOfRandomValuesOnInterval(10, 0, 10);
            printArray(array);
        }
    }

    private static int[] initArrayOfRandomValuesOnInterval(int sizeArray, int start, int end) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = getRandomOnInterval(start, end);
        }
        return array;
    }

    private static int getRandomOnInterval(int start, int end) {
        return ThreadLocalRandom.current().nextInt(start, end + 1);
    }


    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
