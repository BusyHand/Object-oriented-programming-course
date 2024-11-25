package patterns.factory.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.List;
@Getter
@EqualsAndHashCode
public class Developer extends Employee {


    private BigDecimal bonusSalary;

    private List<String> tasks;

    public Developer(@NonNull Long id, @NonNull String name, @NonNull BigDecimal baseSalary, @NonNull BigDecimal bonusSalary, @NonNull List<String> tasks) {
        super(id, name, baseSalary);
        this.bonusSalary = bonusSalary;
        this.tasks = tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }
}
