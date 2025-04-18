package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Truck;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository.ITruckRepository;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.repository.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {
    private final ITruckRepository truckRepository = new TruckRepository();


    @Override
    public List<Truck> findAll() {
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
