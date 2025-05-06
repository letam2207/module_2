package case_study.repository.I;

import case_study.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();

    void add(Employee employee);

    void updateEmployeeById( Employee employee);

    Employee findId(String id);

}
