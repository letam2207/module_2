package he_thong_quan_ly_phuong_tien.view;

import he_thong_quan_ly_phuong_tien.entity.Car;

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
        Car car = new Car(controlPlate,company,year,name,
                vehicleType,numberOfSeats);
        return car;
    }
    public static void displayCar(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i]!=null){
                System.out.println(cars[i]);
            }else {
                break;
            }
        }
    }
}
