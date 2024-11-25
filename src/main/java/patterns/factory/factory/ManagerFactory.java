package patterns.factory.factory;

import patterns.factory.model.Manager;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ManagerFactory extends EmployeeFactory {

    @Override
    public Manager createEmployee() {
        return new Manager(count++, "Саня", new BigDecimal(50_000), new BigDecimal(50_000), new ArrayList<>());
    }
}
