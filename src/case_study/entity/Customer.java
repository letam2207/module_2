package case_study.entity;

public class Customer extends Person {
    private String qualification;
    private String position;
    private double salary;

    public Customer() {
    }

    public Customer(String qualification, String position,
                    double salary,int id, String name, String dateOfBirth, String gender,
                    int idCard, int phoneNumber, String email) {
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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfoToFile2(){
        return super.getInfoToFile() + "," + this.qualification + "," + this.position + "," + this.salary;
    }
}
