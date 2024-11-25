package lab_1;

/**
6.	Минимум четырех чисел Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b).
*/
public class Task6 {

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3, 4));
    }

    private static int min(int a, int b, int c, int d) {
        return min(a, min(b, min(c, d)));
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }
}
