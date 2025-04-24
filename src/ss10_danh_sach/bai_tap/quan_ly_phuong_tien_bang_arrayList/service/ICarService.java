package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Car;

import java.util.List;

public interface ICarService {
    List<Car> findAll();
    void add(Car car);
    void delete(String i);
}
