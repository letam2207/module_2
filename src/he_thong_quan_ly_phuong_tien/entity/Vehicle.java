package he_thong_quan_ly_phuong_tien.entity;

public abstract class Vehicle {
    private String controlPlate;
    private String manufacturingCompany;
    private int yearOfManufacture;

    private String owner;
    public Vehicle(){
    }
    public Vehicle(String controlPlate, String manufacturingCompany,
                   int yearOfManufacture, String owner){
        this.controlPlate = controlPlate;
        this.manufacturingCompany = manufacturingCompany;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }



    public String getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(String controlPlate) {
        this.controlPlate = controlPlate;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public String toString() {
        return "Person{" +
                "Biển kiểm soát ='" + controlPlate + '\'' +
                ", Hãng xe = '" + manufacturingCompany + '\'' +
                ", Năm sản xuất = '" + yearOfManufacture + '\'' +
                ", Tên chủ xe ='" + owner + '\'' +
                '}';
    }
}
