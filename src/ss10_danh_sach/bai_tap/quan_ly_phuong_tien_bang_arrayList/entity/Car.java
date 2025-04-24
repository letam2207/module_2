package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity;

public class Car extends Vehicle {
    private String vehicleType;
    private int numberOfSeats;


    public Car(){
    }
    public Car(String vehicleType,int numberOfSeats){
        this.vehicleType = vehicleType;
        this.numberOfSeats = numberOfSeats;
    }
    public Car(String controlPlate,String manufacturingCompany,
               int yearOfManufacture, String owner,String vehicleType,int numberOfSeats){
        super(controlPlate,manufacturingCompany,yearOfManufacture,owner);
        this.vehicleType = vehicleType;
        this.numberOfSeats = numberOfSeats;

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Loại xe ='" + vehicleType + '\'' +
                "Biển kiểm soát ='" + getControlPlate() + '\'' +
                ", Hãng xe = '" + getManufacturingCompany() + '\'' +
                ", Năm sản xuất = '" + getYearOfManufacture() + '\'' +
                ", Tên chủ xe ='" + getOwner() + '\'' +
                ", Số chỗ ngồi =" + numberOfSeats +
                '}';
    }
    public String getInfoToFIle1(){
        return getControlPlate()+","+getManufacturingCompany()+","+getYearOfManufacture()+","+getOwner()+","+this.vehicleType+","+this.numberOfSeats;
    }
}