package case_study.entity;

public class Employee extends Person {
    private String position;
    private  String level;
    int salary;

    public Employee() {
    }

    public Employee(String id , String name, String dateOfBirth, String gender,
                    String idCard , String phoneNumber, String email,
                    String level , String position,int salary) {
        super(id,name,dateOfBirth,gender,idCard,phoneNumber,email);
        this.position = position;
        this.level = level;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getInfoToFile1(){
        return super.getInfoToFile() + "," + this.position + ","+this.level +","+this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "position='" + position + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                '}';
    }
}
