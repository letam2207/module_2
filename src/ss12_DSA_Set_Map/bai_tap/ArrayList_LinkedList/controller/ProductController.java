package ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.controller;


import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.entity.Product;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.service.ProductService;
import ss12_DSA_Set_Map.bai_tap.ArrayList_LinkedList.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static ProductService productService = new ProductService();
    public static void displayProduct() {
        do {
            System.out.println("ỨNG DỤNG QUẢN LÝ SẢN PHẨM " +
                    "\n Chọn chức năng: " +
                    "\n 1. Thêm mới sản phẩm." +
                    "\n 2. Sửa sản phẩm" +
                    "\n 3. Xóa sản phẩm" +
                    "\n 4. Hiển thị danh sách sản phẩm" +
                    "\n 5. Tìm kiếm sản phẩm theo tên" +
                    "\n 6. Sắp xếp sản phẩm tăng dần,giảm dần theo giá ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                        View.addProduct();
                        break;
                case 2:
                        View.updateById();
                        break;
                case 3:
                        View.deleteProduct();
                        break;
                case 4:
                    List<Product> products = productService.findAll();
                    View.displayProduct(products);
                    break;
                case 5:
                    View.searchProduct();
                    break;
                case 6:
                    View.arrangeProduct();

            }
        } while (true);

    }
}


