package he_thong_quan_ly_phuong_tien.service;

import he_thong_quan_ly_phuong_tien.entity.Motorbike;
import he_thong_quan_ly_phuong_tien.repository.IMotorbikeRepository;
import he_thong_quan_ly_phuong_tien.repository.MotorbikeRepository;

public class MotorbikeService implements IMotorbikeService{
    private IMotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    @Override
    public Motorbike[] findAll() {
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
