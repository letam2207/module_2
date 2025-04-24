package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Car;

import java.util.List;

public interface ICarRepository {
    List<Car> findAll();
    void add(Car car);

    boolean delete(String i);
}
