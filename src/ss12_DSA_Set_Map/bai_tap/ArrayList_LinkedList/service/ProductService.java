package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.service;

import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.repository.IProductRepository;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
          productRepository.add(product);
    }

    @Override
    public boolean delete(int id) {
       return productRepository.delete(id);
    }

    @Override
    public  ArrayList<Product> search(String name) {
        return productRepository.findByName(name);

    }

    @Override
    public void updateById(int id, Product product) {
        productRepository.updateById(id, product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }


}
