package lab_1;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 13.	Создать статический метод,
 * который будет иметь два целочисленных параметра a и b,
 * и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
 * C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.
 */
public class Task13 {

    public static void main(String[] args) {
        int[] array = initArrayOfRandomValuesOnInterval(20,0, 10);
        printArray(array);
        System.out.println();

        array = initArrayOfRandomValuesOnInterval(20,1, 5);
        printArray(array);
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
