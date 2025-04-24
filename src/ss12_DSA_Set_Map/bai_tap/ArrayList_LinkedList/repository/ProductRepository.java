package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.repository;

import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.common.ReadAndWrite;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String PRODUCT_FILE = "ss12_DSA_Set_Map/bai_tap/ArrayList_LinkedList/data/product.csv";


    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFileCSV(PRODUCT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Product product = new Product(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]));
            productList.add(product);
        }
        return productList;
    }

    @Override
    public void add(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToFIle());
        ReadAndWrite.writeFileCSV(PRODUCT_FILE, stringList, true);
    }

    @Override
    public boolean delete(int id) {
        List<Product> productList = findAll();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                check = true;
                productList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Product p : productList) {
            stringList.add(p.getInfoToFIle());
        }
        ReadAndWrite.writeFileCSV(PRODUCT_FILE, stringList, false);
        return check;
    }

    @Override
    public Product findById(int id) {
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getId()==id){
//                return products.get(i);
//            }
//        }
        return null;
    }

    @Override
    public ArrayList<Product> findByName(String name) {
//        ArrayList<Product> products1 = new ArrayList<>();
//        for (int i = 0; i <products.size(); i++) {
//            if (products.get(i).getName().toLowerCase().contains(name.toLowerCase())){
//                products1.add(products.get(i));
//            }
//        }
        return null;
    }
    private List<String> convertToStringArray(List<Product> products){
        List<String> stringList = new ArrayList<>();
        for (Product p: products){
            stringList.add(p.getInfoToFIle());
        }
        return stringList;
    }

    @Override
    public void updateById(int id, Product product) {
        List<Product> productList = findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                break;
            }
        }
        List<String> stringList = convertToStringArray(productList);
        ReadAndWrite.writeFileCSV(PRODUCT_FILE, stringList, false);
    }



}
