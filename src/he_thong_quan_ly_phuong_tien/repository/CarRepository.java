package he_thong_quan_ly_phuong_tien.repository;

import he_thong_quan_ly_phuong_tien.entity.Car;

public class CarRepository implements ICarRepository {
    private static Car[] cars = new Car[10];

    static {
        cars[0] = new Car("43A-212.56","Toyota"
                ,2019,"Du lịch","Nguyễn Văn A",5	);
        cars[1] = new Car("43B-453.88","Huyndai"
                ,2020,"Xe  khách","Nguyễn Văn B",45	);
    }

    @Override
    public Car[] findAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i]==null){
                cars[i] = car;
                break;
            }
        }
    }

    @Override
    public void delete(int i) {
        for (int j = i; j < cars.length; j++ ){
            if(j == cars.length-1){
                cars[j] = null;
            }else{
                cars[j] = cars[j + 1];
            }
        }
    }


}
