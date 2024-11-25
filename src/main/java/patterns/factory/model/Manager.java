package patterns.factory.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.List;

@Getter
@EqualsAndHashCode
public class Manager extends Employee {

    private List<Employee> subordinates;

    public Manager(@NonNull Long id, @NonNull String name, @NonNull BigDecimal baseSalary, @NonNull BigDecimal bonusSalary, @NonNull List<Employee> subordinates) {
        super(id, name, baseSalary);
        this.bonusSalary = bonusSalary;
        this.subordinates = subordinates;
    }

    public void addSubordinate(Employee subordinate) {
        subordinates.add(subordinate);
    }


}
