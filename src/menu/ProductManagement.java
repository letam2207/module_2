package menu;

import java.util.Arrays;
import java.util.Scanner;

public class ProductManagement {
    Scanner scanner = new Scanner(System.in);
    public static Product[] products = new Product[5];

    static {
        products[0] = new Product(1, "Nam", 19);
        products[1] = new Product(3, "Tâm", 21);
        products[2] = new Product(2, "Vinh", 20);
        products[3] = new Product(5, "Chiến", 20);
        products[4] = new Product(4, "Huy", 20);
    }

    public void displayStudent() {
//        Arrays.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                //return o1.getId()-o2.getId();   //theo ID
//                return o1.getName().compareTo(o2.getName());   //theo tên
//            }
//        });

        Arrays.sort(products, (p1, p2) -> p1.getId() - p2.getId());   //theo ID (nâng cao)
      //  Arrays.sort(products,(p1,p2)->p1.getName().compareTo(p2.getName()));  //theo tên (nâng cao)

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
    }

    public void addStudent() {
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, age);
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void deleteStudent() {
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
    }
    public void updateStudent(){
        System.out.println("nhập id bạn muốn thay đổi sản phẩm");
        int updateId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == updateId) {
                System.out.println("nhập tên bạn muốn thay đổi");
                String updateName = scanner.nextLine();
                System.out.println("nhập tuổi muốn thay đổi");
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
    }
    public void searchStudent(){
        System.out.println("nhập id ");
    }
}
