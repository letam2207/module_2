package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.view;

import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.controller.ProductController;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.service.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class View {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductController.displayProduct();
    }

    public static void displayProduct(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static void addProduct() {
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        productService.add(new Product(id, name, price));
    }

    public static void deleteProduct() {
        System.out.println("Nhập ID cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        productService.delete(id);
    }

    public static void searchProduct() {
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        ArrayList<Product> products = productService.search(name);
        displayProduct(products);
    }

    public static void updateById() {
        System.out.println("Nhập ID sp cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = productService.findById(id);
        System.out.println("Nhập tên mới: ");
        String name = scanner.nextLine();
        product.setName(name);
        System.out.println("Nhập giá mới: ");
        double price = Double.parseDouble(scanner.nextLine());
        product.setPrice(price);
        productService.updateById(id, product);
    }

}
