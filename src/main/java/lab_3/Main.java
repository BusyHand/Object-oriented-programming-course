package lab_3;

import java.util.Arrays;

/**
 * Задачи:
 * ☑ 1. Написать два класса: Horse(лошадь) - в конструкторе задается кличка лошади и
 * Pegas(пегас) - релизующий метод полет(сообщает какая лошадь летит). Унаследовать пегаса от лошади.
 * <p>
 * ☑ 2. Написать три класса: Pet(домашнее животное) - с полями вес, пол, возраст,
 * Cat(кот) с полем имя и Dog(собака) с полем имя. Унаследовать кота и собаку от животного.
 * В классах кот и собака реализовать методы вывода информации и о животных
 * <p>
 * ☑ 3. Написать четыре класса: Fish (Рыбы), Animal(Животные), Ape(Обезьяны), Human(Человек).
 * Унаследовать животных от рыб, обезьян от животных и человека от обезьян.
 * Поля и методы разработать самостоятельно.
 * <p>
 * ☑ 4. Скрыть все внутренние переменные класса Cat, добавить методы работы с этими переменными
 */
public class Main {

    public static void main(String[] args) {
        char[][] a = new char[10][10];
        Arrays.stream(a)
                .map(Arrays::toString)
                .forEach(System.out::println);
    }
}
