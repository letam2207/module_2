package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.repository;

import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void add(Product product);

    boolean delete(int id);

    Product findById(int id);

    ArrayList<Product> findByName(String name);

    void updateById(int id, Product product);

}
