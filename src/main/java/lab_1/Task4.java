package lab_1;

import java.util.Scanner;

/**
4.	Минимум двух чисел.
Ввести с клавиатуры два числа, и вывести на экран минимальное из них
(Поиск минимума выполняется в функции).
*/
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(min(scanner.nextInt(), scanner.nextInt()));
        }
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

}
