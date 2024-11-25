package lab_1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 15.	Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.
 */
public class Task15 {

    public static void main(String[] args) {
        int[] array = initArrayOfRandomValuesOnInterval(20, 0, 100);
        System.out.println("Array before sorting:");
        printArray(array);

        sort(array);

        System.out.println("Array after sorting:");
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

    private static void sort(int[] array) {
        int mid = array.length / 2;

        for (int i = mid - 1; i >= 0; i--) {
            heapSort(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            heapSort(array, i, 0);
        }
    }

    private static void heapSort(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapSort(array, n, largest);
        }
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
