package lab_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Lab1AllTasks {

    /**
     * 1.	Четные числа Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
     * Через пробел либо с новой строки.
     */
    private static void printEvenNumbersOnInterval(int start, int end) {
        for (; start <= end; start++) {
            if (start % 2 == 0) {
                System.out.println(start);
            }
        }
    }

    /**
     * 2. Рисуем прямоугольник Ввести с клавиатуры два числа m и n.
     * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
     */
    private static void printRectangleMN(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }

    /**
     * 3. Рисуем треугольник
     * Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
     */
    private static void printTriangleWithSides10By10() {
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }

    /**
     * 4.	Минимум двух чисел.
     * Ввести с клавиатуры два числа, и вывести на экран минимальное из них
     * (Поиск минимума выполняется в функции).
     */
    public static void main1(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(min(scanner.nextInt(), scanner.nextInt()));
        }
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    /**
     * 5.	Сравнить имена Ввести с клавиатуры два имени,
     * и если имена одинаковые, вывести сообщение «Имена идентичны».
     * Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
     */
    public static void main2(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String firstWord = scanner.next();
            String secondWord = scanner.next();
            System.out.println(compareWords(firstWord, secondWord));
        }
    }

    private static String compareWords(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            return "Имена идентичны";
        } else if (firstWord.length() == secondWord.length()) {
            return "Длины имен равны";
        }
        return "";
    }

    /**
     * 6.	Минимум четырех чисел Написать функцию, которая вычисляет минимум из четырёх чисел.
     * Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b).
     */
    public static void main3(String[] args) {
        System.out.println(min(1, 2, 3, 4));
    }

    private static int min(int a, int b, int c, int d) {
        return min(a, min(b, min(c, d)));
    }


    /**
     * 7.	Координатные четверти Ввести с клавиатуры два целых числа, которые будут координатами точки,
     * не лежащей на координатных осях OX и OY.
     * Вывести на экран номер координатной четверти, в которой находится данная точка.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Quarter: " +
                    calculateQuarterCoordinates(scanner.nextInt(), scanner.nextInt()));
        }
    }

    private static int calculateQuarterCoordinates(int x, int y) {
        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }


    /**
     * 8.	Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива
     * на экран сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик
     * (отделяя один элемент от другого началом новой строки).
     * Перед созданием массива подумайте, какого он будет размера.
     */
    public static void main4(String[] args) {
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

    /**
     * 9.	Создайте массив из всех нечётных чисел от 1 до 99,
     * выведите его на экран в строку,
     * а затем этот же массив выведите на экран тоже в строку,
     * но в обратном порядке (99 97 95 93 … 7 5 3 1).
     */
    public static void main5(String[] args) {
        int[] array = getArrayOfOddNumbersInInterval(1, 99);
        printArray2(array);
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

    private static void printArray2(int[] array) {
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

    /**
     * 10.	Создайте массив из 15 случайных целых чисел из отрезка [0;9].
     * Выведите массив на экран.
     * Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
     */
    public static void main6(String[] args) {
        int[] array = initArrayRandomValueInIntervar(15, 0, 9);
        printArray3(array);
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

    private static void printArray3(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * 11.	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
     * Вывести массив на экран.
     */
    public static void main7(String[] args) {
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

    /**
     * 12.	Создать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
     * Вывести массив на экран.
     * Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
     * Если таких строк несколько, то вывести индекс первой встретившейся из них.
     */
    public static void main8(String[] args) {
        int[][] array = initDoubleArrayOfRandomValues2(8, 5);
        printArray7(array);
    }

    private static int[][] initDoubleArrayOfRandomValues2(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(-5, 6);
            }
        }
        return array;
    }

    private static void printArray7(int[][] array) {
        for (int[] innerArray : array) {
            for (int value : innerArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


    /**
     * 13.	Создать статический метод,
     * который будет иметь два целочисленных параметра a и b,
     * и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
     * C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.
     */
    public static void main9(String[] args) {
        int[] array = initArrayOfRandomValuesOnInterval(20, 0, 10);
        printArray9(array);
        System.out.println();

        array = initArrayOfRandomValuesOnInterval(20, 1, 5);
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


    private static void printArray9(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * 14.	Создать метод, который будет выводить указанный массив на экран в строку.
     * С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов из 10 элементов
     * каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.
     */
    public static void main10(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Array : " + (i + 1));
            int[] array = initArrayOfRandomValuesOnInterval(10, 0, 10);
            printArray10(array);
        }
    }

    private static int[] initArrayOfRandomValuesOnInterval10(int sizeArray, int start, int end) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = getRandomOnInterval(start, end);
        }
        return array;
    }

    private static int getRandomOnInterval10(int start, int end) {
        return ThreadLocalRandom.current().nextInt(start, end + 1);
    }


    private static void printArray10(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * 15.	Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.
     */
    public static void main15(String[] args) {
        int[] array = initArrayOfRandomValuesOnInterval15(20, 0, 100);
        System.out.println("Array before sorting:");
        printArray15(array);

        sort(array);

        System.out.println("Array after sorting:");
        printArray15(array);
    }

    private static int[] initArrayOfRandomValuesOnInterval15(int sizeArray, int start, int end) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = getRandomOnInterval(start, end);
        }
        return array;
    }

    private static int getRandomOnInterval15(int start, int end) {
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


    private static void printArray15(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    /**
     * 16.	Выясните экспериментальном путём, начиная с какого элемента последовательности Фибоначчи,
     * вычисление с использованием рекурсии становится неприемлемым (занимает более минуты по времени).
     * <p>
     * Ответ: элемент последовательности под №52 или №53 , занимает более минуты нахождения по времени
     */
    private static final int SECONDS_IN_MINUTE = 60;

    public static void main16(String[] args) {
        long passedTime = 0;
        for (int i = 2; passedTime < SECONDS_IN_MINUTE; i++) {
            long start = System.nanoTime();
            fibonacci(i);
            long end = System.nanoTime();

            passedTime = TimeUnit.SECONDS
                    .convert(end - start, TimeUnit.NANOSECONDS);
            System.out.println("№" + i + " time passed: " + passedTime + " seconds");
        }
    }

    private static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
