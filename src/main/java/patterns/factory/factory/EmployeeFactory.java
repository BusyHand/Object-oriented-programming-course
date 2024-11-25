package patterns.factory.factory;

import patterns.factory.model.Employee;

public abstract class EmployeeFactory {

    protected long count = 0;// В обучающих целях, не тредсэйф

    public abstract Employee createEmployee();
}
