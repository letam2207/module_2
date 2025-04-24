package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.common.ReadAndWrite;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private final String TRUCK_FILE = "ss10_danh_sach/bai_tap/quan_ly_phuong_tien_bang_arrayList/data/truck.csv";


    @Override
    public List<Truck> findAll() {
        List<Truck> truckList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFileCSV(TRUCK_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Truck truck = new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
            truckList.add(truck);
        }
        return truckList;
    }


    @Override
    public void add(Truck truck) {
        List<String> stringList = new ArrayList<>();
        stringList.add(truck.getInfoToFIle3());
        ReadAndWrite.writeFileCSV(TRUCK_FILE, stringList, true);
    }

    @Override
    public boolean delete(String truckIndex) {
        List<Truck> truckList = findAll();
        boolean check = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (truckIndex == truckList.get(i).getControlPlate()) {
                check = true;
                System.out.println(truckList.remove(i));
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Truck t : truckList) {
            stringList.add(t.getInfoToFIle3());
        }
        ReadAndWrite.writeFileCSV(TRUCK_FILE, stringList, false);
        return check;
    }
}
