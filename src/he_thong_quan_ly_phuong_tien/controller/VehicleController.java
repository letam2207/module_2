package he_thong_quan_ly_phuong_tien.controller;

import he_thong_quan_ly_phuong_tien.entity.Car;
import he_thong_quan_ly_phuong_tien.entity.Motorbike;
import he_thong_quan_ly_phuong_tien.entity.Truck;
import he_thong_quan_ly_phuong_tien.service.CarService;
import he_thong_quan_ly_phuong_tien.service.MotorbikeService;
import he_thong_quan_ly_phuong_tien.service.TruckService;
import he_thong_quan_ly_phuong_tien.view.CarView;
import he_thong_quan_ly_phuong_tien.view.MotorbikeView;
import he_thong_quan_ly_phuong_tien.view.TruckView;
import he_thong_quan_ly_phuong_tien.view.View;

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
                    Truck[] trucks = truckService.findAll();
                    TruckView.displayTruck(trucks);
                    break;
                case 2:
                    Car[] cars = carService.findAll();
                    CarView.displayCar(cars);
                    break;
                case 3:
                    Motorbike[] motorbikes = motorbikeService.findAll();
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
        Car[] cars = carService.findAll();
        Truck[] trucks = truckService.findAll();
        Motorbike[] motorbikes = motorbikeService.findAll();
        for (int i = 0; i < cars.length; i++){
            if(cars[i] != null){
                if(cars[i].getControlPlate().equals(licensePlate)){
                    carService.delete(i);
                    check = true;
                    System.out.println(" Bạn đã xóa thành công");
                }
            }else{
                break;
            }
        }
        if(check == false){
            for (int i = 0; i < trucks.length; i++){
                if(trucks[i] != null){
                    if(trucks[i].getControlPlate().equals(licensePlate)){
                        truckService.delete(i);
                        check = true;
                        System.out.println(" Bạn đã xóa thành công");
                    }
                }else{
                    break;
                }
            }
        }

        if(check == false){
            for (int i = 0; i < motorbikes.length; i++){
                if(motorbikes[i] != null){
                    if(motorbikes[i].getControlPlate().equals(licensePlate)){
                        motorbikeService.delete(i);
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
