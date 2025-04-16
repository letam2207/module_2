package he_thong_quan_ly_phuong_tien.repository;

import he_thong_quan_ly_phuong_tien.entity.Car;

public interface ICarRepository {
    Car[] findAll();
    void add(Car car);

    void delete(int i);
}
