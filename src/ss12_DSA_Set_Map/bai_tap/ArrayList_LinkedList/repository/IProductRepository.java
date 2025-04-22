package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.repository;

import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> findAll();

    void add(Product product);

    void delete(int id);

    Product findById(int id);

    ArrayList<Product> findByName(String name);

    void updateById(int id, Product product);

}
