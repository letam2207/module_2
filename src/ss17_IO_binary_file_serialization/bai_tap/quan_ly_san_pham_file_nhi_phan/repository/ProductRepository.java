package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.repository;

import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.commom.ReadAndWrite;
import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String PRODUCT_DAT_FILE = "ss17_IO_binary_file_serialization/bai_tap/quan_ly_san_pham_file_nhi_phan/data/product.dat";
    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        productList = ReadAndWrite.readBinaryToListStudent(PRODUCT_DAT_FILE);
        return productList;
    }

    @Override
    public void add(Product product) {
        List<Product> productList = ReadAndWrite.readBinaryToListStudent(PRODUCT_DAT_FILE);
        productList.add(product);
        ReadAndWrite.writeListStudentToBinaryFile(PRODUCT_DAT_FILE,productList);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = findAll();
        List<Product> foundProducts = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductName().contains(name)){
                foundProducts.add(productList.get(i));
            }
        }
        return foundProducts;
    }
}
