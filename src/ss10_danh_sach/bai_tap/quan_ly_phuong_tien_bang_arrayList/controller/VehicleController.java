package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.controller;


import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Car;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Motorbike;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Truck;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service.CarService;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service.MotorbikeService;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.service.TruckService;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.view.CarView;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.view.MotorbikeView;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.view.TruckView;
import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.view.View;

import java.util.List;
import java.util.Scanner;

public class VehicleController {
    public static TruckService truckService = new TruckService();
    public static CarService carService = new CarService();
    public static MotorbikeService motorbikeService = new MotorbikeService();
    public static void displayMenu() {
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG" +
                    "\n Chọn chức năng: " +
                    "\n 1. Thêm mới phương tiện." +
                    "\n 2. Hiện thị phương tiện" +
                    "\n 3. Xóa phương tiện" +
                    "\n 4. Thoát ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    VehicleController.addVehicle();
                    break;
                case 2:
                    VehicleController.displayVehicle();
                    break;
                case 3:
                    VehicleController.deleteVehicle();
                    break;
                case 4:
                    System.out.println("xin chào hẹn gặp lại!");
                    System.exit(0);

            }
        } while (true);
    }

    public static void addVehicle() {
        TruckService truckService = new TruckService();
        CarService carService = new CarService();
        MotorbikeService motorbikeService = new MotorbikeService();
        boolean flag = true;
        do {
            System.out.println("CHỨC NĂNG THÊM MỚI PHƯƠNG TIỆN" +
                    "\n Chọn chức năng: " +
                    "\n 1. Thêm mới xe tải." +
                    "\n 2. Thêm mới xe ô tô" +
                    "\n 3. Thêm mới xe máy" +
                    "\n 4. Thoát ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Truck trucks = TruckView.addTruck();
                    truckService.add(trucks);
                    System.out.println("Bạn thêm xe thàng công!");
                    break;
                case 2:
                    Car cars = CarView.addCar();
                    carService.add(cars);
                    System.out.println("Bạn thêm xe thàng công!");
                    break;
                case 3:
                    Motorbike motorbikes = MotorbikeView.addMotorbike();
                    motorbikeService.add(motorbikes);
                    System.out.println("Bạn thêm xe thàng công!");
                    break;
                case 4:
                    flag = false;

            }
        } while (flag);
    }


    public static void displayVehicle() {

        boolean flag = true;
        do {
            System.out.println("CHƯƠNG TRÌNH HIỂN THỊ PHƯƠNG TIỆN " +
                    "\n Chọn chức năng: " +
                    "\n 1. Hiển thị danh sách xe tải." +
                    "\n 2. Hiển thị danh sách xe ô tô." +
                    "\n 3. Hiển thị danh sách xe máy." +
                    "\n 4. Thoát ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    List<Truck> trucks = truckService.findAll();
                    TruckView.displayTruck(trucks);
                    break;
                case 2:
                    List<Car> cars = carService.findAll();
                    CarView.displayCar(cars);
                    break;
                case 3:
                    List<Motorbike> motorbikes = motorbikeService.findAll();
                    MotorbikeView.displayMotorbike(motorbikes);
                    break;
                case 4:
                    flag = false;

            }
        } while (flag);
    }

    public static void deleteVehicle(){
        String licensePlate = View.inputLicensePlate();
        boolean check = false;
        List<Car> cars = carService.findAll();
        List<Truck> trucks = truckService.findAll();
        List<Motorbike> motorbikes = motorbikeService.findAll();
        for (int i = 0; i < cars.size(); i++){
            if(cars.get(i) != null){
                if(cars.get(i).getControlPlate().equals(licensePlate)){
                    carService.delete(String.valueOf(i));
                    check = true;
                    System.out.println(" Bạn đã xóa thành công");
                }
            }else{
                break;
            }
        }
        if(check == false){
            for (int i = 0; i < trucks.size(); i++){
                if(trucks.get(i) != null){
                    if(trucks.get(i).getControlPlate().equals(licensePlate)){
                        truckService.delete(String.valueOf(i));
                        check = true;
                        System.out.println(" Bạn đã xóa thành công");
                    }
                }else{
                    break;
                }
            }
        }

        if(check == false){
            for (int i = 0; i < motorbikes.size(); i++){
                if(motorbikes.get(i) != null){
                    if(motorbikes.get(i).getControlPlate().equals(licensePlate)){
                        motorbikeService.delete(String.valueOf(i));
                        check = true;
                        System.out.println(" Bạn đã xóa thành công");
                    }
                }else{
                    break;
                }
            }
        }
        if (check==false){
            System.out.println("Biển số xe không tồn tại");
        }
    }
}
