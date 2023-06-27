import exceptions.employeeProblemException;
import implementation.EmployeeBookImpl;
import interfaces.EmployeeBook;
import persons.Employee;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBookImpl();
        HashMap<String, Employee> employee = new HashMap<>(Map.of(
                "AlexLebedev", new Employee("Alex", "Lebedev"),
                "IvanKozlov", new Employee("Ivan", "Kozlov"),
                "NikolaTesla", new Employee("Nikola", "Tesla"),
                "AlexeyAvramenko", new Employee("Alexey", "Avramenko"),
                "OlegPrudnyakov", new Employee("Oleg", "Prudnyakov"),
                "SergiyMychaylov", new Employee("Sergiy", "Mychaylov")
        ));
        System.out.println("Изначальный список");
        employeeBook.printEmployee(employee);

        try {
            employeeBook.addEmployee(new Employee("Yurii", "Yatsenko"), employee);
            System.out.println("Добавление сотрудника");
            employeeBook.printEmployee(employee);

            System.out.println("Поиск сотрудника");
            Employee foundEmployee = employeeBook.findEmployee(new Employee("Yurii", "Yatsenko"), employee);
            System.out.println("Сотрудник найден - " + foundEmployee.toString() + "\n");

            employeeBook.deleteEmployee(new Employee("Yurii", "Yatsenko"), employee);
            System.out.println("Удаление сотрудника");
            employeeBook.printEmployee(employee);

        } catch (employeeProblemException e) {
            System.out.println(e.getMessage());
        }

    }
}