package case_study.entity;

public class Employee extends Person {
    private String customerType;
    private  String address;
    int salary;

    public Employee() {
    }

    public Employee(String customerType, String address,String id,
                    String name, String dateOfBirth, String gender,
                    String idCard, String phoneNumber, String email,int salary) {
        super(id,name,dateOfBirth,gender,idCard,phoneNumber,email);
        this.customerType = customerType;
        this.address = address;
        this.salary = salary;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getInfoToFile1(){
        return super.getInfoToFile() + "," + this.customerType+ ","+this.address+","+this.salary;
    }
}
