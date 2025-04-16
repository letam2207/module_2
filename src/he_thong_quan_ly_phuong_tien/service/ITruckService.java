package he_thong_quan_ly_phuong_tien.service;

import he_thong_quan_ly_phuong_tien.entity.Truck;

public interface ITruckService {
    Truck[] findAll();
    void add(Truck truck);

    void delete(int i);
}
