package implementation;

import exceptions.employeeProblemException;
import interfaces.EmployeeBook;
import persons.Employee;

import java.util.*;

public class EmployeeBookImpl implements EmployeeBook {
    @Override
    public void addEmployee(Employee emp, HashMap<String, Employee> employee) throws employeeProblemException {
        if (employee.containsKey(emp.getFirstName() + emp.getLastName()))
            throw new employeeProblemException("Ошибка! Сотрудник уже существует в базе");
        employee.put(emp.getFirstName() + emp.getLastName(), emp);
    }

    @Override
    public void deleteEmployee(Employee emp, HashMap<String, Employee> employee) throws employeeProblemException {
        if (!employee.containsKey(emp.getFirstName() + emp.getLastName()))
            throw new employeeProblemException("Ошибка! Сотрудник не найден в базе");
        employee.remove(emp.getFirstName() + emp.getLastName());
    }

    @Override
    public Employee findEmployee(Employee emp, HashMap<String, Employee> employee) throws employeeProblemException {
        if (!employee.containsKey(emp.getFirstName() + emp.getLastName()))
            throw new employeeProblemException("Ошибка! Сотрудник не найден в базе");
        return employee.get(emp.getFirstName() + emp.getLastName());
    }

    @Override
    public void printEmployee(HashMap<String, Employee> employee) {
//        Set<Employee> e = (Set<Employee>) employee.values();
        for (Employee emp : employee.values())
            System.out.println(emp.toString());
        System.out.println();
    }
}
