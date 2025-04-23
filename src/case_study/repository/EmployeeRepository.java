package case_study.repository;

import case_study.entity.Employee;

import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {

  private static   ArrayList<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee());
    }

    @Override
    public ArrayList<Employee> find() {
        return null;
    }
}
