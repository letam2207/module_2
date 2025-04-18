package ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.view;



import ss10_danh_sach.bai_tap.quan_ly_phuong_tien_bang_arrayList.entity.Motorbike;

import java.util.List;
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
    public static void displayMotorbike(List<Motorbike> motorbikes){
        for (int i = 0; i < motorbikes.size(); i++) {
                System.out.println(motorbikes.get(i));
        }
    }
}