package he_thong_quan_ly_phuong_tien.service;

import he_thong_quan_ly_phuong_tien.entity.Truck;

import java.util.List;

public interface ITruckService {
    Truck[] findAll();
    void add(Truck truck);

    void delete(int i);
}
