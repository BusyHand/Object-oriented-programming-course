package lab_1;

import java.util.concurrent.ThreadLocalRandom;

/**
10.	Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
*/
public class Task10 {

    public static void main(String[] args) {
        int[] array = initArrayRandomValueInIntervar(15, 0, 9);
        printArray(array);
        System.out.println(countEvenValues(array));
    }

    private static int countEvenValues(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int[] initArrayRandomValueInIntervar(int sizeArray, int start, int end) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
