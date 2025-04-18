package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity;

public class Truck extends Vehicle {
    private int load;
    public Truck(){
    }
    public Truck(int load){
        this.load = load;
    }
    public Truck(String controlPlate, String manufacturingCompany,
                 int yearOfManufacture, String owner,int load){
        super(controlPlate,manufacturingCompany,yearOfManufacture,owner);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Biển kiểm soát ='" + getControlPlate() + '\'' +
                ", Hãng xe = '" + getManufacturingCompany() + '\'' +
                ", Năm sản xuất = '" + getYearOfManufacture() + '\'' +
                ", Tên chủ xe ='" + getOwner() + '\'' +
                "Tải trọng=" + load +
                '}';
    }
}
