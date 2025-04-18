package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static List<Truck> trucks = new ArrayList<>();

    static {
        trucks.add(new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3)) ;
        trucks.add(new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9)) ;
    }


    @Override
    public List<Truck> findAll() {
        return trucks;
    }


    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void delete(int truckIndex) {
        trucks.remove(truckIndex);
    }
}
