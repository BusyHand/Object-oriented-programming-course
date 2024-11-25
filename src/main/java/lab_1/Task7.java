package lab_1;

import java.util.Scanner;

/**
7.	Координатные четверти Ввести с клавиатуры два целых числа, которые будут координатами точки,
не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
*/
public class Task7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Quarter: " +
                    calculateQuarterCoordinates(scanner.nextInt(), scanner.nextInt()));
        }
    }

    private static int calculateQuarterCoordinates(int x, int y) {
        if(x > 0){
            if(y > 0){
                return 1;
            }else {
                return 4;
            }
        } else {
            if(y > 0){
                return 2;
            }else {
                return 3;
            }
        }
    }
}
