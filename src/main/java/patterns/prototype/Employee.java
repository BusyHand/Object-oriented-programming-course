package patterns.prototype;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Employee implements Cloneable {

    Long id;
    String name;
    String email;
    String phone;
    BigDecimal salary;

    @Override
    protected Employee clone() {
        return new Employee(id, name, email, phone, salary);
    }
}
