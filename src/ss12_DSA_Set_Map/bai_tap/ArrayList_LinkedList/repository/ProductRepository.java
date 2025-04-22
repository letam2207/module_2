package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.repository;

import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public  class ProductRepository implements IProductRepository{

    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"Xiaomi",1200000));
        products.add(new Product(2,"Iphone",1900000));
        products.add(new Product(3,"Samsung",2200000));
        products.add(new Product(4,"Vivo",1400000));
    }

    @Override
    public ArrayList<Product> findAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {
        products.remove(findById(id));
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public  ArrayList<Product> findByName(String name) {
        ArrayList<Product> products1 = new ArrayList<>();
        for (int i = 0; i <products.size(); i++) {
            if (products.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                products1.add(products.get(i));
            }
        }
        return products1;
    }

    @Override
    public void updateById(int id, Product product) {
        for (int i = 0; i < products.size(); i++){
            if(products.get(i).getId() == id){
                products.set(i, product);
                break;
            }
        }
    }




}
