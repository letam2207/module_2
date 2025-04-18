package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository;



import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository {
    private static List<Motorbike> motorbikes = new ArrayList<>();

    static {
        motorbikes.add(new Motorbike("43-K1-678.56","Yamaha",
                2019,"Nguyễn Văn A",100)) ;
        motorbikes.add(new Motorbike("43-H1-345.89","Honda",
                2019,"Nguyễn Văn B",150)) ;
    }


    @Override
    public List<Motorbike> findAll() {
        return motorbikes;
    }

    @Override
    public void add(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    @Override
    public void delete(int motorbikeIndex) {
        motorbikes.remove(motorbikeIndex);

    }
}
