package he_thong_quan_ly_phuong_tien.service;

import he_thong_quan_ly_phuong_tien.entity.Car;

public interface ICarService {
    Car[] findAll();
    void add(Car car);
    void delete(int i);
}
