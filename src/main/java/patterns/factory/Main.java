package patterns.factory;

import patterns.factory.factory.DeveloperFactory;
import patterns.factory.factory.EmployeeFactory;
import patterns.factory.factory.ManagerFactory;
import patterns.factory.model.Developer;
import patterns.factory.model.Manager;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        Developer developer = developerFactory.createEmployee();
        System.out.println("Created developer: " + developer.getName());

        ManagerFactory managerFactory = new ManagerFactory();
        Manager manager = managerFactory.createEmployee();
        System.out.println("Created manager: " + manager.getName());
    }
}
