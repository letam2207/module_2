package case_study.repository;

import case_study.entity.Employee;

import java.util.ArrayList;

public interface IEmployeeRepository {
    ArrayList<Employee> find();
}
