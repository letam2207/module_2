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
                    SubMenu.employeeManagement();
                    break;
                case 2:
                    SubMenu.customerManagement();
                    break;
                case 3:
                    SubMenu.facilityManagement();
                    break;
                case 4:
                    SubMenu.bookingManagement();
                    break;
                case 5:
                    SubMenu.promotionManagement();
                    break;
                case 6:
                      System.exit(0);
            }
        }while (true);

    }

}
