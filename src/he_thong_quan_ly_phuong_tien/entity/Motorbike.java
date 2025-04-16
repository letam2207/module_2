package he_thong_quan_ly_phuong_tien.entity;

public class Motorbike extends Vehicle {
    private int capacity;

    public Motorbike(){
    }

    public Motorbike(int capacity){
        this.capacity = capacity;
    }
    public Motorbike(String controlPlate,String manufacturingCompany,
                     int yearOfManufacture, String owner,int capacity){
        super(controlPlate,manufacturingCompany,yearOfManufacture,owner);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "Biển kiểm soát ='" + getControlPlate() + '\'' +
                ", Hãng xe = '" + getManufacturingCompany() + '\'' +
                ", Năm sản xuất = '" + getYearOfManufacture() + '\'' +
                ", Tên chủ xe ='" + getOwner() + '\'' +
                "phân khối =" + capacity +
                '}';
    }
}
