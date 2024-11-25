package patterns.prototype;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Employee володя = new Employee(1L, "Володя", "volody@mail.ru", "8 800 555 35 35", new BigDecimal(40_000));
        Employee клонВолодя = володя.clone();

        System.out.println("Проверка по equals: " + володя.equals(клонВолодя));
        System.out.println("Проверка по ссылкам: " + (володя == клонВолодя));
    }
}
