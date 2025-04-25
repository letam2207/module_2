package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.service;

import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void add(Product product);

    List<Product> findByName(String name);
}
