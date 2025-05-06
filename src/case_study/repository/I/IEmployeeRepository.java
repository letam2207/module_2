package case_study.repository.I;

import case_study.entity.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();

    void add(Employee employee);

<<<<<<< HEAD:src/case_study/repository/I/IEmployeeRepository.java
    void updateEmployeeById(int id, Employee employee);
=======
    void updateById(int id,Employee employee);
>>>>>>> 4ae4b90cd9c4eecc4f301c8bb5a5e28c41482238:src/case_study/repository/IEmployeeRepository.java
}
