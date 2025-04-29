package case_study.controller;

import java.util.Scanner;

public class SubMenu {
    static Scanner scanner = new Scanner(System.in);

    public static void employeeManagement() {
        System.out.println("1. Hiển thị danh sách nhân viên" +
                "\n 2. Thêm nhân viên mới " +
                "\n 3. Chỉnh sửa nhân viên " +
                "\n 4. Quay lại Menu ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:

            case 2:
            case 3:
            case 4:
        }
    }

    public static void customerManagement() {
        System.out.println("1. Hiển thị danh sách khách hàng" +
                "\n 2. Thêm nhân khách hàng mới " +
                "\n 3. Chỉnh sửa khách hành " +
                "\n 4. Quay lại Menu ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
            case 2:
            case 3:
            case 4:
        }
    }

    public static void facilityManagement() {
        System.out.println("1 Hiển thị danh sách tiện ích" +
                "\n 2 Thêm tiện ích mới" +
                "\n 3 Hiển thị danh sách tiện ích bảo trì" +
                "\n 4 Quay lại menu chính");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
            case 2:
            case 3:
            case 4:
        }
    }

    public static void bookingManagement() {
        System.out.println("1. Thêm đặt chỗ mới\n" +
                "2. Hiển thị danh sách đặt chỗ\n" +
                "3. Tạo hợp đồng mới\n" +
                "4. Hiển thị danh sách hợp đồng\n" +
                "5. Chỉnh sửa hợp đồng\n" +
                "6. Quay lại menu chính");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
        }
    }

    public static void promotionManagement() {
        System.out.println("1. Hiển thị danh sách khách hàng sử dụng dịch vụ\n" +
                "2. Hiển thị danh sách khách hàng nhận voucher\n" +
                "3. Quay lại menu chính");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
            case 2:
            case 3:

        }
    }
}
