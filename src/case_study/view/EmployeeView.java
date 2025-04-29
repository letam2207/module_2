package case_study.view;

import case_study.entity.Employee;
import case_study.service.C.EmployeeService;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeView {
    private static EmployeeService employeeService = new EmployeeService();
    private static Scanner scanner = new Scanner(System.in);
    public static void displayEmployee(List<Employee> employees){
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }
    public static void addEmployee() {
        String employeeId;
        String idRegex = "^NV-[0-9]{4}$";
        Pattern pattern = Pattern.compile(idRegex);
        do {
            System.out.println(" nhập mã nhân viên : ");
            employeeId = scanner.nextLine();
            Matcher matcher = pattern.matcher(employeeId);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("sai định dạng nhập lại");
            }
        } while (true);
        String employeeName;
        String nameRegex = "^[A-Z][a-z]*\\s([A-Z][a-z]*\\s)*[A-Z][a-z]*$";
        Pattern pattern2 = Pattern.compile(nameRegex);
        do {
            System.out.println(" nhập tên : ");
            employeeName = scanner.nextLine();
            Matcher matcher = pattern2.matcher(employeeName);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("sai định dạng nhập lại");
            }
        } while (true);

        String employeeDate;
        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$";
        Pattern pattern3 = Pattern.compile(dateRegex);
        do {
            System.out.println(" nhập ngày tháng năm sinh : ");
            employeeDate = scanner.nextLine();
            Matcher matcher = pattern3.matcher(employeeDate);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("sai định dạng nhập lại");
            }
        } while (true);

        System.out.println("nhập giới tính : ");
        String employeeGender = scanner.nextLine();

        String employeeIdCard;
        String idCardRegex = "^[0-9]{9}([0-9]{3})?$";
        Pattern pattern4 = Pattern.compile(idCardRegex);
        do {
            System.out.println(" nhập CCCD : ");
            employeeIdCard = scanner.nextLine();
            Matcher matcher = pattern4.matcher(employeeIdCard);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("sai định dạng nhập lại");
            }
        } while (true);
        String employeeNumberPhone;
        String numberPhonedRegex = "^0[0-9]{9}$";
        Pattern pattern5 = Pattern.compile(numberPhonedRegex);
        do {
            System.out.println(" nhập số điện thoại : ");
            employeeNumberPhone = scanner.nextLine();
            Matcher matcher = pattern5.matcher(employeeNumberPhone);
            if (matcher.matches()) {
                break;
            } else {
                System.out.println("sai định dạng nhập lại");
            }
        } while (true);

        System.out.println("Nhập Email : ");
        String email = scanner.nextLine();
        System.out.println("Nhập tình độ : ");
        String leve = scanner.nextLine();
        System.out.println("Nhập vị trí : ");
        String position = scanner.nextLine();
        int salary;
        do {
            System.out.println("nhâp lương : ");
            salary = scanner.nextInt();
            if (salary < 0) {
                System.out.println("sai định dạng nhập lại");
            } else {
                break;
            }
        } while (true);
        employeeService.add(new Employee(employeeId, employeeName, employeeDate, employeeGender, employeeIdCard
                , employeeNumberPhone, email, leve, position, salary));
    }
}
