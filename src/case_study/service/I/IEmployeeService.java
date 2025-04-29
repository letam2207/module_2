package case_study.service.I;

import case_study.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    void add(Employee employee);
    void updateEmployeeById(int id,Employee employee);
}
