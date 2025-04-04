package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args){
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();//nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat();//nhập chiều cao

        float area = (width * height);//diện tích hình chữ nhật

        System.out.println("Area is: "+area);
    }
}
