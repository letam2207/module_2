package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Motorbike;

import java.util.List;

public interface IMotorbikeService  {
    List<Motorbike> findAll();
    void add(Motorbike motorbike);

    void delete(String i);
}
