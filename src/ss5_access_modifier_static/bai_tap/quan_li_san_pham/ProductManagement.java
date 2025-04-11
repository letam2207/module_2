package ss5_access_modifier_static.bai_tap.quan_li_san_pham;

import java.util.Scanner;

public class ProductManagement {
    public static Product[] products = new Product[100];

    static {
        products[0] = new Product(1, "Iphone", 24000000);
        products[1] = new Product(2, "Xiaomi", 21000000);
        products[2] = new Product(3, "ViVo", 20000000);
    }

    Scanner scanner = new Scanner(System.in);

    public void displayProduct() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
    }

    public void addProduct() {
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập giá: ");
        double price = scanner.nextDouble();
        Product product = new Product(id, name, price);
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
        displayProduct();
    }

    public void deleteProduct() {
        System.out.println("nhập ID cần xóa: ");
        int deleteId = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == deleteId) {
                check = true;
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[products.length - 1] = null;
                System.out.println("Đã xóa sản phẩm");
            }
        }
        if (!check) {
            System.out.println("không tìm thấy id ");
        }
        displayProduct();
    }

    public void updateProduct() {
        System.out.println("nhập id bạn muốn thay đổi sản phẩm");
        int updateId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == updateId) {
                System.out.println("nhập tên bạn muốn thay đổi");
                String updateName = scanner.nextLine();
                System.out.println("nhập giá muốn thay đổi");
                int updateAge = scanner.nextInt();
                scanner.nextLine();
                products[i] = new Product(updateId, updateName, updateAge);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy id ");
        }
        displayProduct();
    }

    public void searchProduct() {
        System.out.println("nhập tên sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        boolean check = false;
        for (Product product : products) {
            if (product != null && product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
                check = true;
            }
        }
        if (!check) {
            System.out.println("không có sản phẩm " + name + " này");
        }
    }
}
