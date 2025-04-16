package he_thong_quan_ly_phuong_tien.service;
import he_thong_quan_ly_phuong_tien.repository.ICarRepository;
import he_thong_quan_ly_phuong_tien.entity.Car;
import he_thong_quan_ly_phuong_tien.repository.CarRepository;

public class CarService implements ICarRepository {
    private ICarRepository carRepository = new CarRepository();


    @Override
    public Car[] findAll() {
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
