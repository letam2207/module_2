package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Car;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository.CarRepository;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository.ICarRepository;

import java.util.List;

public class CarService implements ICarRepository {
    private ICarRepository carRepository = new CarRepository();


    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }

    @Override
    public void delete(int i) {
        carRepository.delete(i);
    }
}

