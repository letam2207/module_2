package case_study.service.C;

import case_study.entity.Employee;
import case_study.repository.C.EmployeeRepository;
import case_study.repository.I.IEmployeeRepository;
import case_study.service.I.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll() ;
    }

    @Override
    public void add(Employee employee) {
       employeeRepository.add(employee);
    }

    @Override
    public void updateEmployeeById(int id, Employee employee) {
      employeeRepository.updateEmployeeById(id,employee);
    }
}
