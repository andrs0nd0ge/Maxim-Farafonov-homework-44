package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDataModel {
    private Employee employee = new Employee("Brad", "Barnard");
    private List<Employee> employees = new ArrayList<>();
    public EmpDataModel() {
        employees.add(new Employee(1, "Brad", "Barnard"));
        employees.add(new Employee(2, "Jeffery", "Carney"));
        employees.add(new Employee(3, "Philip", "Salter"));

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
