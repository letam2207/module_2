package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.common.ReadAndWrite;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private final String CAR_FILE="ss10_danh_sach/bai_tap/quan_ly_phuong_tien_bang_arrayList/data/car.csv";


    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFileCSV(CAR_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Car car = new Car(array[0],array[1],Integer.parseInt(array[2]),array[3],array[4],Integer.parseInt(array[5]));
            carList.add(car);
        }
        return carList;
    }

    @Override
    public void add(Car car) {
     List<String> stringList = new ArrayList<>();
     stringList.add(car.getInfoToFIle1());
     ReadAndWrite.writeFileCSV(CAR_FILE,stringList,true);
    }

    @Override
    public boolean delete(String carIndex) {
      List<Car> carList = findAll();
      boolean check = false;
        for (int i = 0; i < carList.size(); i++) {
            if (carIndex==carList.get(i).getControlPlate()){
                check = true;
                carList.remove(i);
                break;
            }
        }
      List<String> stringList = new ArrayList<>();
        for (Car c : carList){
            stringList.add(c.getInfoToFIle1());
        }
        ReadAndWrite.writeFileCSV(CAR_FILE,stringList,false);
        return check;
    }


}
