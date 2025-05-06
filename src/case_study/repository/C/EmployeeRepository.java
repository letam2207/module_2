package case_study.repository.C;

import case_study.common.ReadAndWrite;
import case_study.entity.Employee;
import case_study.repository.I.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_FILE = "case_study/data/employee.csv";
    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFileCSV(EMPLOYEE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Employee employee = new Employee(array[0], array[1], array[2]
                    , array[3], array[4], array[5], array[6],
                    array[7], array[8], Integer.parseInt(array[9]));
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


    private List<String> covertToStringArray(List<Employee> employeeList){
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList){
            stringList.add(e.getInfoToFile1());
        }
        return stringList;
    }

    @Override
    public void updateEmployeeById(Employee employee) {
        List<Employee> employeeList = findAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(employee.getId())){
                employeeList.set(i,employee);
                break;
            }
        }
        List<String> stringList = covertToStringArray(employeeList);
        ReadAndWrite.writeFileCSV(EMPLOYEE_FILE,stringList,false);
    }

    @Override
    public Employee findId(String id) {
        List<Employee> employees = findAll();
      for (Employee e : employees){
          if (e.getId().equals(id)){
              return e;
          }
      }
        return null;
    }


}
