package ru.gb.StudentsApp.Services;

import ru.gb.StudentsApp.Domen.Employee;
import ru.gb.StudentsApp.Domen.PersonComparator;

import java.util.List;

/**
 * Class to realize base functionality to work with Employees
 */
public class EmployeeService implements IPersonService<Employee> {

    private final List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public List<Employee> GetAll() {
        return employees;
    }

    @Override
    public void Create(String name, int age) {
        employees.add(new Employee(name, age, "not specified"));
    }

    @Override
    public void Create(String name, int age, String description) {
        employees.add(new Employee(name, age, description));
    }

    /**
     * Comparator based on PersonComparator Class to compare Employees by their names
     */
    public void SortByName(){
        PersonComparator<Employee> personComparator = new PersonComparator<>();
        employees.sort(personComparator);
    }
}
