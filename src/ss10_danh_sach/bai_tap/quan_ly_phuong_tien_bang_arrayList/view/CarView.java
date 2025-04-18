package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.view;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Car;

import java.util.List;
import java.util.Scanner;

public class CarView {
    private static Scanner scanner = new Scanner(System.in);

    public static Car addCar(){
        System.out.println("thêm xe mới");
        System.out.println("Nhập Biển số xe: ");
        String controlPlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String company = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ xe: ");
        String name = scanner.nextLine();
        System.out.println("nhập loại xe: ");
        String vehicleType = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi của xe:");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        Car car = new Car(controlPlate,company,year,name,vehicleType,numberOfSeats);
        return car;
    }
    public static void displayCar(List<Car> cars){
        for (int i = 0; i < cars.size(); i++) {
                System.out.println(cars.get(i));

        }
    }
}
