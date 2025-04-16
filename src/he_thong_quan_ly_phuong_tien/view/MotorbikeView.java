package he_thong_quan_ly_phuong_tien.view;

import he_thong_quan_ly_phuong_tien.entity.Motorbike;

import java.util.Scanner;

public class MotorbikeView {
    private static Scanner scanner = new Scanner(System.in);

    public static Motorbike addMotorbike(){
        System.out.println("thêm xe mới");
        System.out.println("Nhập Biển số xe: ");
        String controlPlate = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String company = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ xe: ");
        String name = scanner.nextLine();
        System.out.println("Nhập công xuất:");
        int capacity = Integer.parseInt(scanner.nextLine());
        Motorbike motorbike = new Motorbike(controlPlate,company,
                year,name,capacity);
        return motorbike;
    }
    public static void displayMotorbike(Motorbike[] motorbikes){
        for (int i = 0; i < motorbikes.length; i++) {
            if (motorbikes[i]!=null){
                System.out.println(motorbikes[i]);
            }else {
                break;
            }
        }
    }
}
