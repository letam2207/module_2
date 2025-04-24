package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service;



import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Truck;

import java.util.List;

public interface ITruckService {
    List<Truck> findAll();
    void add(Truck truck);

    void delete(String i);
}
