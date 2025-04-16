package he_thong_quan_ly_phuong_tien.repository;

import he_thong_quan_ly_phuong_tien.entity.Motorbike;

public interface IMotorbikeRepository {
 Motorbike[] findAll();
 void add(Motorbike motorbike);

    void delete(int i);
}
