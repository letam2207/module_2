package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository;



import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.common.ReadAndWrite;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository {
    private final String MOTORBIKE_FILE="ss10_danh_sach/bai_tap/quan_ly_phuong_tien_bang_arrayList/data/motorbike.csv";


    @Override
    public List<Motorbike> findAll() {
        List<Motorbike> motorbikeList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFileCSV(MOTORBIKE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Motorbike motorbike = new Motorbike(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
            motorbikeList.add(motorbike);
        }
        return motorbikeList;
    }

    @Override
    public void add(Motorbike motorbike) {
        List<String> stringList = new ArrayList<>();
     stringList.add(motorbike.getInfoToFIle2());
     ReadAndWrite.writeFileCSV(MOTORBIKE_FILE,stringList,true);
    }

    @Override
    public boolean delete(String motorbikeIndex) {
      List<Motorbike> motorbikeList = findAll();
      boolean check = false;
        for (int i = 0; i < motorbikeList.size(); i++) {
            if (motorbikeIndex==motorbikeList.get(i).getControlPlate()){
                check = true;
                motorbikeList.remove(i);
                break;
            }
        }
      List<String> stringList = new ArrayList<>();
        for (Motorbike m : motorbikeList){
            stringList.add(m.getInfoToFIle2());
        }
        ReadAndWrite.writeFileCSV(MOTORBIKE_FILE,stringList,false);
        return check;

    }
}
