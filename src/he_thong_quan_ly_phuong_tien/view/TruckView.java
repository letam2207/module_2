package he_thong_quan_ly_phuong_tien.view;

import he_thong_quan_ly_phuong_tien.entity.Truck;

import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);

    public static Truck addTruck() {
        System.out.println("thêm xe mới");
        System.out.println("Nhập Biển số xe: ");
        String controlPlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String company = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ xe: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tải trọng:");
        int load = Integer.parseInt(scanner.nextLine());
        Truck truck = new Truck(controlPlate, company,
                year, name, load);
        return truck;
    }
    public static void displayTruck(Truck[] trucks){
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i]!=null){
                System.out.println(trucks[i]);
            }else {
                break;
            }
        }
    }
}