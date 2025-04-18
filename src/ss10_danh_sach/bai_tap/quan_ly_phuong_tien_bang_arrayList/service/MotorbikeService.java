package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Motorbike;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository.IMotorbikeRepository;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository.MotorbikeRepository;

import java.util.List;

public class MotorbikeService implements IMotorbikeService {
    private IMotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public List<Motorbike> findAll() {
        return motorbikeRepository.findAll();
    }

    @Override
    public void add(Motorbike motorbike) {
        motorbikeRepository.add(motorbike);
    }

    @Override
    public void delete(int i) {
        motorbikeRepository.delete(i);
    }
}
