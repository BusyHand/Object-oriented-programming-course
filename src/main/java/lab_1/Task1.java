package lab_1;

/**
1.	Четные числа Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/
public class Task1 {

    public static void main(String[] args) {
        printEvenNumbersOnInterval(1, 100);
    }

    private static void printEvenNumbersOnInterval(int start, int end) {
        for (; start <= end; start++) {
            if (start % 2 == 0) {
                System.out.print(start + " ");
            }
        }
    }

}
