package lab_1;
import java.util.concurrent.TimeUnit;
/**
 * 16.	Выясните экспериментальном путём, начиная с какого элемента последовательности Фибоначчи,
 * вычисление с использованием рекурсии становится неприемлемым (занимает более минуты по времени).
 *
 * Ответ: элемент последовательности под №52 или №53 , занимает более минуты нахождения по времени
 */
public class Task16 {

    private static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        long passedTime = 0;
        for (int i = 2; passedTime < SECONDS_IN_MINUTE; i++) {
            long start = System.nanoTime();
            fibonacci(i);
            long end = System.nanoTime();

            passedTime = calculateSecs(start, end);
            System.out.println("№" + i + " time passed: " + passedTime + " seconds");
        }
    }

    private static long calculateSecs(long start, long end) {
        return TimeUnit.SECONDS.convert(end - start, TimeUnit.NANOSECONDS);
    }

    private static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
