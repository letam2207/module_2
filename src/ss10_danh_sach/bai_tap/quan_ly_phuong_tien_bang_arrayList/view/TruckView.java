package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.view;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Truck;

import java.util.List;
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
    public static void displayTruck(List<Truck> trucks){
        for (int i = 0; i < trucks.size(); i++) {

            System.out.println(trucks.get(i));
        }
    }
}