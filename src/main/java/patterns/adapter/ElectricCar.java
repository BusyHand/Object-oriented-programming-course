package patterns.adapter;

import lombok.SneakyThrows;

public class ElectricCar {
    @SneakyThrows
    public void charge() {
        System.out.print("Зарядка электромобиля...");
        for (int i = 1; i < 11; i++) {
            Thread.sleep(250);
            System.out.print(" => " + (i * 10) + "%");
        }
        System.out.println("\nЗарядка завершена");
    }
}