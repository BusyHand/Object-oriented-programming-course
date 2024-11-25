package patterns.factory.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode
public abstract class Employee {

    protected Long id;

    protected String name;
    protected BigDecimal baseSalary;
    protected BigDecimal bonusSalary;

    public Employee(@NonNull Long id, @NonNull String name, @NonNull BigDecimal baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
}
