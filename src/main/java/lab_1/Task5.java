package lab_1;

import java.util.Scanner;

/**
5.	Сравнить имена Ввести с клавиатуры два имени,
и если имена одинаковые, вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/
public class Task5 {

    public static void main(String[] args) {
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
}
