package he_thong_quan_ly_phuong_tien.service;

import he_thong_quan_ly_phuong_tien.entity.Motorbike;

public interface IMotorbikeService  {
    Motorbike[] findAll();
    void add(Motorbike motorbike);

    void delete(int i);
}
