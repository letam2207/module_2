package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.service;


import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.entity.Product;
import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.repository.IProductRepository;
import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.repository.ProductRepository;

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
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
