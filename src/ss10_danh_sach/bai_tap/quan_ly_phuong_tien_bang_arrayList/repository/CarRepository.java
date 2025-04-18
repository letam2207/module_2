package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("43A-212.56","Toyota"
                ,2019,"Du lịch","Nguyễn Văn A",5	)) ;
        cars.add(new Car("43B-453.88","Huyndai"
                ,2020,"Xe  khách","Nguyễn Văn B",45	)) ;
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
       cars.add(car);
    }

    @Override
    public void delete(int carIndex) {
        cars.remove(carIndex);
    }


}
