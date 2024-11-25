package patterns.adapter;

import lombok.SneakyThrows;

public class GasolineСar implements GasolineFueling {


    @Override
    @SneakyThrows
    public void refuel() {
        System.out.println("Смотрим цены на бензин");
        Thread.sleep(1000);
        System.err.println("Не хватает денег на бензин, покупай Теслу");
    }
}
