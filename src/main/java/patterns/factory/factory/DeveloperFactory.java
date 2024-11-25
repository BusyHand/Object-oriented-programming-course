package patterns.factory.factory;

import patterns.factory.model.Developer;
import patterns.factory.model.Manager;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DeveloperFactory extends EmployeeFactory {

    @Override
    public Developer createEmployee() {
        return new Developer(count++, "Антон", new BigDecimal(50_000), new BigDecimal(50_000), new ArrayList<>());
    }
}