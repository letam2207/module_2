package case_study.repository;

import case_study.common.ReadAndWrite;
import case_study.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_FILE = "";
    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFileCSV(EMPLOYEE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Employee employee = new Employee(array[0], array[1], Integer.parseInt(array[3])
                    , array[4], array[5], array[6], Integer.parseInt(array[7]),
                    Integer.parseInt(array[8]), array[9], Integer.parseInt(array[10]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoToFile1());
        ReadAndWrite.writeFileCSV(EMPLOYEE_FILE,stringList,true);
    }



}
