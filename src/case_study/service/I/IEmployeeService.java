package case_study.service.I;

import case_study.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    void add(Employee employee);
    void updateEmployeeById(Employee employee);
    Employee findId(String id);
}
