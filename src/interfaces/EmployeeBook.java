package interfaces;

import exceptions.employeeProblemException;
import persons.Employee;

import java.util.HashMap;

public interface EmployeeBook {
    void addEmployee(Employee emp, HashMap<String, Employee> employee) throws employeeProblemException;

    void deleteEmployee(Employee emp, HashMap<String, Employee> employee) throws employeeProblemException;

    Employee findEmployee(Employee emp, HashMap<String, Employee> employee) throws employeeProblemException;

    void printEmployee(HashMap<String, Employee> employee);
}
