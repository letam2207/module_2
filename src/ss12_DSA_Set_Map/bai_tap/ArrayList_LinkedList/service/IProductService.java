package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.service;

import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Car;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void add(Product product);
    boolean delete(int id);
    ArrayList<Product> search(String name);

    void updateById(int id, Product product);

    Product findById(int id);
}
