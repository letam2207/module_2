package he_thong_quan_ly_phuong_tien.repository;

import he_thong_quan_ly_phuong_tien.entity.Truck;

public class TruckRepository implements ITruckRepository {
    private static Truck[] trucks = new Truck[4];

    static {
        trucks[0] = new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 3);
        trucks[1] = new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 9);
    }


    @Override
    public Truck[] findAll() {
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] == null) {
                trucks[i] = truck;
                break;
            }
        }

    }

    @Override
    public void delete(int i) {
        for (int j = i; j < trucks.length; j++ ){
            if(j == trucks.length-1){
                trucks[j] = null;
            }else{
                trucks[j] = trucks[j + 1];
            }

        }
    }
}
