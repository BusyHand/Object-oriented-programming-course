package lab_1;

/**
8.	Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива
на экран сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик
(отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.
*/
public class Task8 {

    public static void main(String[] args) {
        int[] array = fileArrayEvenNumberInInterval(2, 20);
        printArray(array);
    }

    private static int[] fileArrayEvenNumberInInterval(int start, int end) {
        int sizeArray = getSizeOfEvenNumberInInterval(start, end);
        int[] array = new int[sizeArray];
        int j = 0;
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                array[j++] = i;
            }
        }
        return array;
    }

    private static int getSizeOfEvenNumberInInterval(int start, int end) {
        int sizeArray = 0;
        for (int i = 2; i < 20; i++) {
            if (i % 2 == 0) {
                sizeArray++;
            }
        }
        return sizeArray;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}
