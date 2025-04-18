package he_thong_quan_ly_phuong_tien.service;

import he_thong_quan_ly_phuong_tien.entity.Truck;
import he_thong_quan_ly_phuong_tien.repository.ITruckRepository;
import he_thong_quan_ly_phuong_tien.repository.TruckRepository;

public class TruckService implements ITruckService{
    private final ITruckRepository truckRepository = new TruckRepository();


    @Override
    public Truck[] findAll() {
        return truckRepository.findAll();
    }

    @Override
    public void add(Truck truck) {
      truckRepository.add(truck);
    }

    @Override
    public void delete(int i) {
        truckRepository.delete(i);
    }
}
