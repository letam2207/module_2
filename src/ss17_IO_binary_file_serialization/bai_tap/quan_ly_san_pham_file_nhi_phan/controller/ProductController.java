package ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.controller;

import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.entity.Product;
import ss17_IO_binary_file_serialization.bai_tap.quan_ly_san_pham_file_nhi_phan.service.ProductService;

import java.util.List;
import java.util.Scanner;



public class ProductController {
    static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();
    public static void displayProduct() {
        do {


            try {
                System.out.println("ỨNG DỤNG QUẢN LÝ SẢN PHẨM " +
                        "\n Chọn chức năng: " +
                        "\n 1. Thêm mới sản phẩm." +
                        "\n 2. Hiển thị danh sách sản phẩm" +
                        "\n 3. Tìm kiếm sản phẩm theo tên" +
                        "\n 4.Thoát chương trình ");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chọn chức năng: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        List<Product> products = productService.findAll();
                        displayProduct1(products);
                        break;
                    case 3:
                        searchProduct();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("lựa chọn không hợp lệ");
                }
            }catch (NumberFormatException e){
                System.out.println("Nhập số");
            }
        } while (true);

    }
    public static void displayProduct1(List<Product> products){
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
        System.out.println("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Mô tả sản phẩm: ");
        String describe = scanner.nextLine();
        productService.add(new Product(id,name,price,manufacturer,describe));

    }

    public static void searchProduct(){
        System.out.println("nhập tên muốn tìm kiếm");
        String name = scanner.nextLine();
        List<Product> productList = productService.findByName(name);
        displayProduct1(productList);
    }
}
