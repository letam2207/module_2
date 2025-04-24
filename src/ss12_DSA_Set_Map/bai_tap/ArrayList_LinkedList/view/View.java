package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.view;

import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.controller.ProductController;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductController.displayProduct();
    }

    public static void displayProduct(List<Product> products) {
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
        int price = Integer.parseInt(scanner.nextLine());
        productService.add(new Product(id, name, price));
    }

    public static void deleteProduct() {
        System.out.println("Nhập ID cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = productService.delete(id);
        if (check){
            System.out.println("xóa thành công");
        }else {
            System.out.println("không tìm thấy id");
        }
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
        int price = Integer.parseInt(scanner.nextLine());
        product.setPrice(price);
        productService.updateById(id, product);

    }

    public static void arrangeProduct() {
        boolean check = true;
        while (check) {
            ArrayList<Product> products = (ArrayList<Product>) productService.findAll();
            System.out.println("""
                    1. Sắp xếp tăng dần theo giá\
                    
                    2. Sắp xếp giảm dần theo giá\
                    
                    3. thoát""");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    products.sort((p1, p2) -> (int) (p1.getPrice() - p2.getPrice()));
                    displayProduct(products);
                    break;
                case 2:
                    products.sort((p1, p2) -> (int) (p2.getPrice() - p1.getPrice()));
                    displayProduct(products);
                    break;
                case 3:
                    check = false;
                default:
                    System.out.println("vui lòng nhập đúng lựa chọn");
            }
        }

    }
}
