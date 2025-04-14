package ss5_access_modifier_static.bai_tap.quan_li_san_pham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Search");
            System.out.println("6. Exit");
            System.out.println("Lựa chọn của bạn: ");
            int enter = scanner.nextInt();
            switch (enter) {
                case 1:
                    productManagement.displayProduct();
                    break;
                case 2:
                    productManagement.addProduct();
                    break;
                case 3:
                    productManagement.deleteProduct();
                    break;
                case 4:
                    productManagement.updateProduct();
                    break;
                case 5:
                    productManagement.searchProduct();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);



    }
}
