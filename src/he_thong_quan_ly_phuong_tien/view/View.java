package he_thong_quan_ly_phuong_tien.view;

import he_thong_quan_ly_phuong_tien.controller.VehicleController;

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
