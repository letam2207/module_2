package case_study.entity;

public abstract class Person {
   private String id;
   private String name;
   private String dateOfBirth;
   private String gender;
   private String idCard;
   private String phoneNumber;
   private  String Email;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, String gender,
                  String idCard, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        Email = email;
    }

    public Person(String id) {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard=" + idCard +
                ", phoneNumber=" + phoneNumber +
                ", Email='" + Email + '\'' +
                '}';
    }
    public String getInfoToFile(){
        return this.id+","+this.name+","+this.dateOfBirth
                +","+this.gender+","+this.idCard+","+this.phoneNumber
                +","+this.Email;
    }
}
