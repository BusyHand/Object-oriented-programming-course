package lab_1;

/**
9.	Создайте массив из всех нечётных чисел от 1 до 99,
выведите его на экран в строку,
а затем этот же массив выведите на экран тоже в строку,
но в обратном порядке (99 97 95 93 … 7 5 3 1).
*/
public class Task9 {

    public static void main(String[] args) {
        int[] array = getArrayOfOddNumbersInInterval(1, 99);
        printArray(array);
        printArray(array, true);
    }

    private static int[] getArrayOfOddNumbersInInterval(int start, int end) {
        int sizeArray = getSizeOfOddNumbersInInterval(start, end);
        int[] array = new int[sizeArray];
        int j = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                array[j++] = i;
            }
        }
        return array;
    }

    private static int getSizeOfOddNumbersInInterval(int start, int end) {
        int sizeArray = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                sizeArray++;
            }
        }
        return sizeArray;
    }

    private static void printArray(int[] array) {
        printArray(array, false);
    }

    private static void printArray(int[] array, boolean reversed) {
        int i = 0;
        if (reversed) {
            i = array.length - 1;
        }
        for (; i < array.length && i > -1; i = reversed ? i - 1 : i + 1) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
