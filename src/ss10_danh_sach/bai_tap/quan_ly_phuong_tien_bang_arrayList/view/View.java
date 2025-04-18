package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.view;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.controller.VehicleController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        VehicleController.displayMenu();

    }

    public static String inputLicensePlate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập biển số xe cần xóa");
        String licensePlate = scanner.nextLine();
        return licensePlate;
    }
}
