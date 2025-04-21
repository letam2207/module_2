package CASUDY.controller;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----ỨNG DỤNG QUẢN LÝ KHU NGHỈ DƯỠNG FURAMA----- "+
                                "\n 1. Quản lý nhân viên"+
                                "\n 2. Quản lý khách hàng"+
                                "\n 3. Quản lý cơ sở "+
                                "\n 4. Quản lý đặt phòng"+
                                "\n 5. Quản lý khuyến mại"+
                                "\n 6. Thoát");
            System.out.println("-----Chọn chức năng-----");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("1. Hiển thị danh sách nhân viên"+
                                       "2. Thêm nhân viên mới "+
                                       "3. Chỉnh sửa nhân viên "+
                                       "4. Quay lại Menu ");

                case 2:
                    System.out.println("1. Hiển thị danh sách khách hàng"+
                            "2. Thêm nhân khách hàng mới "+
                            "3. Chỉnh sửa khách hành "+
                            "4. Quay lại Menu ");
                case 3:
                case 4:
                case 5:
                case 6:

            }
        }while (true);




    }
}
