package he_thong_quan_ly_phuong_tien.repository;

import he_thong_quan_ly_phuong_tien.entity.Motorbike;

public class MotorbikeRepository implements IMotorbikeRepository {
    private static Motorbike[] motorbikes = new Motorbike[4];

    static {
        motorbikes[0] = new Motorbike("43-K1-678.56","Yamaha",2019,"Nguyễn Văn A",100);
        motorbikes[1] = new Motorbike("43-H1-345.89","Honda",2019,"Nguyễn Văn B",150);
    }


    @Override
    public Motorbike[] findAll() {
        return motorbikes;
    }

    @Override
    public void add(Motorbike motorbike) {
        for (int i = 0; i < motorbikes.length; i++) {
            if (motorbikes[i] == null) {
                motorbikes[i] = motorbike;
                break;
            }
        }
    }

    @Override
    public void delete(int motorbikeIndex) {
        for (int j = motorbikeIndex; j < motorbikes.length; j++ ){
            if(j == motorbikes.length-1){
                motorbikes[j] = null;
            }else{
                motorbikes[j] = motorbikes[j + 1];
            }

        }
    }
}
