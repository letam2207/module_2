package case_study.entity;

public class Customer extends Person {
    private String qualification;
    private String position;
    private int salary;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, String gender,
                    String idCard, String phoneNumber, String email,String qualification, String position,
                    int salary) {
        super(id,name,dateOfBirth,gender,idCard,phoneNumber,email);
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getInfoToFile2(){
        return super.getInfoToFile() + "," + this.qualification + "," + this.position + "," + this.salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "qualification='" + qualification + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
