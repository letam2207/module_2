package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.repository;

import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.entity.Product;

import java.util.List;

public interface IProductRepository {
    public List<Product> findAll();
    public void add(Product product);

    List<Product> findByName(String name);
}
