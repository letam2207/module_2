package CASUDY.model;

public class Employee extends Person {
    private String customerType;
    private  String address;

    public Employee() {
    }

    public Employee(String customerType, String address,int id,
                    String name, String dateOfBirth, String gender,
                    int idCard, int phoneNumber, String email) {
        super(id,name,dateOfBirth,gender,idCard,phoneNumber,email);
        this.customerType = customerType;
        this.address = address;
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
}
